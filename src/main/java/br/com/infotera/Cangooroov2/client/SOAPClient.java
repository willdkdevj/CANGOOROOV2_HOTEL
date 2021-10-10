package br.com.infotera.Cangooroov2.client;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.support.MarshallingUtils;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Level;

public class SOAPClient extends WebServiceGatewaySupport {

    public Object sendReceive(){ //WSIntegrador integrador, Object object, String action) throws ErrorException {

        Date dtRequest = new Date();
        //integrador.setDsMetodo(action);
        WebServiceMessageSender[] senders = getMessageSenders();

        //aplica timeout
        for (WebServiceMessageSender sender : senders) {
            try {
                HttpUrlConnectionMessageSender httpSender = (HttpUrlConnectionMessageSender) sender;
                httpSender.setReadTimeout(Duration.ofSeconds()); //integrador.getTimeoutSegundos()));
                httpSender.setConnectionTimeout(Duration.ofSeconds(5));
                httpSender.setAcceptGzipEncoding(true);
            } catch (ClassCastException | NumberFormatException cex) {
                logger.warn("Cannot set WS timeout: " + cex.getMessage());
            }
        }

        // Monta Template SOAP
        WebServiceTemplate wsTemplate = getWebServiceTemplate();
        wsTemplate.setDefaultUri(verificaAmbiente()); //integrador));

        Object response = wsTemplate.sendAndReceive(
                new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage) message).setSoapAction(); //action);
                        SoapBody soapBody = ((SoapMessage) message).getSoapBody();
                        try {
                            getMarshaller().marshal(null, soapBody.getPayloadResult()); //object
                        } catch (Exception ex) {
                            java.util.logging.Logger.getLogger(SOAPClient.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        gerarLogs(null, message.getPayloadSource(), true); //integrador
                    }
                }, new WebServiceMessageExtractor<Object>() {
                    @Override
                    public Object extractData(WebServiceMessage message) throws IOException {
                        Object result = null;
                        try {
                            result = MarshallingUtils.unmarshal(getUnmarshaller(), message);
                        } catch (Exception ex) {
                        }
                        gerarLogs(null, message.getPayloadSource(), false); //integrador
                        return result;
                    }
                });

        // Verifica se ocorreu erro na requisição enviada
        verificaErro(response, null); //integrador);

        // Printa tempo e adiciona logs no integrador
        adicionarLogIntegrador(null, dtRequest); //integrador

        return response;
    }

    private void gerarLogs(WSIntegrador integrador, Source source, boolean stRequest) {
        if ("makeRequestRQ".equals(integrador.getDsMetodo()) || integrador.isStGerarLog()) {
            if (stRequest) {
                integrador.setDsRequest(Utils.convertSourceToString(source));
            } else {
                integrador.setDsResponse(Utils.convertSourceToString(source));
            }
        }
    }

    private static void adicionarLogIntegrador(WSIntegrador integrador, Date dtRequest) {
        int ssTempo = Utils.diferencaEmSegundos(dtRequest, new Date());
//        if (ssTempo > 10) {
//            System.out.println(integrador.getDsMetodo() + " " + ssTempo);
//        }
        Utils.adicionaIntegradorLog(integrador,
                integrador.getDsMetodo(),
                integrador.getDsRequest(),
                integrador.getDsResponse(),
                ssTempo);
    }

    private static String verificaAmbiente(WSIntegrador integrador) throws ErrorException {
        String uri = null;
        if (WSAmbienteEnum.PRODUCAO.equals(integrador.getAmbiente())) {
            uri = "AGUARDANDO PROCESSO DE HOMOLOGAÇÃO (SEM URI PRODUÇÃO)";
            throw new ErrorException(integrador, SOAPClient.class, "sendReceive", WSMensagemErroEnum.GENENDPOINT, "PRODUÇÃO NÃO CONFIGURADA", WSIntegracaoStatusEnum.NEGADO, null);
        } else {
            uri = "http://infoteraproposal.xml.goglobal.travel/xmlwebservice.asmx";
        }
        return uri;
    }

    private static void verificaErro(Object obj, WSIntegrador integrador) throws ErrorException {
        String dsErro = "";

        if (obj instanceof String) {

            String retorno = (String) obj;
            if (retorno.contains("HOTEL_SEARCH_REQUEST")) {
                DisponibilidadeRS disponibilidadeRS = (DisponibilidadeRS) gson.fromJson(retorno, DisponibilidadeRS.class);
                if (disponibilidadeRS.getMain() != null && disponibilidadeRS.getMain().getError() != null && disponibilidadeRS.getMain().getError().getMessage() != null) {
                    dsErro = disponibilidadeRS.getMain().getError().getMessage();
                }
            } else if (retorno.contains("HOTEL_INFO_REQUEST")) {
                Root root = (Root) Utils.stringTOobject(retorno, Root.class);
                if (root.getMain() != null && root.getMain().getErrorXml() != null) {
                    dsErro = root.getMain().getErrorXml();
                }
            } else if (retorno.contains("BOOKING_INSERT_REQUEST")) {
                Root root = (Root) Utils.stringTOobject(retorno, Root.class);
                if (root.getMain() != null && root.getMain().getErrorXml() != null) {
                    dsErro = root.getMain().getErrorXml();
                }
            } else if (retorno.contains("BOOKING_SEARCH_REQUEST")) {
                RootConsulta root = (RootConsulta) Utils.stringTOobject(retorno, RootConsulta.class);
                if (root.getMain() != null && root.getMain().getErrorXml() != null) {
                    dsErro = root.getMain().getErrorXml();
                }
            } else if (retorno.contains("BOOKING_CANCEL_REQUEST")) {
                Root root = (Root) Utils.stringTOobject(retorno, Root.class);
                if (root.getMain() != null && root.getMain().getErrorXml() != null) {
                    dsErro = root.getMain().getErrorXml();
                }
            } else if (retorno.contains("ADV_BOOKING_SEARCH_REQUEST")) {
                Root root = (Root) Utils.stringTOobject(retorno, Root.class);
                if (root.getMain() != null && root.getMain().getErrorXml() != null) {
                    dsErro = root.getMain().getErrorXml();
                }
            } else {
                dsErro = "";
            }

        }

        if (!dsErro.equals("")) {
            throw new ErrorException(integrador, SOAPClient.class, "VerificaErro", WSMensagemErroEnum.GENNULO, "Mensagem do fornecedor " + dsErro, WSIntegracaoStatusEnum.INCONSISTENTE, null);
        }
    }

}
