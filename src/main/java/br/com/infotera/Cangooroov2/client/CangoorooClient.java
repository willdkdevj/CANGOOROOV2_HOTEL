package br.com.infotera.Cangooroov2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CangoorooClient {
    @Autowired
    private SOAPClient soapClient;

    public DisponibilidadeRS makeRequestRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        DisponibilidadeRS disponibilidade = null;
        try {
            makeRequest.setRequestType("11");
            integrador.setDsMetodo("makeRequestRQ");
            disponibilidade = (DisponibilidadeRS) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");

        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "makeRequestRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo makeRequestRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return disponibilidade;
    }

    public Root rootPreReservarRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        Root root = null;
        try {
            makeRequest.setRequestType("9");
            integrador.setDsMetodo("rootPreReservarRQ");
            root = (Root) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");
        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "rootRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo rootPreReservarRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return root;
    }

    public RootConsulta rootConsultaRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        RootConsulta rootConsulta = null;
        try {
            makeRequest.setRequestType("4");
            integrador.setDsMetodo("rootConsultaRQ");
            rootConsulta = (RootConsulta) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");
        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "rootConsultaRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo rootConsultaRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return rootConsulta;
    }

    public Root rootDetalheHotelRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        Root root = null;
        try {
            makeRequest.setRequestType("61");
            integrador.setDsMetodo("rootDetalheHotelRQ");
            root = (Root) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");
        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "rootDetalheHotelRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo rootDetalheHotelRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return root;
    }

    public Root rootRelatorioRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        Root root = null;
        try {
            makeRequest.setRequestType("10");
            integrador.setDsMetodo("rootRelatorioRQ");
            root = (Root) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");
        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "rootRelatorioRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo rootRelatorioRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return root;
    }

    public Root rootReservaRQ(WSIntegrador integrador, MakeRequest makeRequest) throws ErrorException {

        Root root = null;
        try {
            makeRequest.setRequestType("2");
            integrador.setDsMetodo("rootReservaRQ");
            root = (Root) soapClient.sendReceive(integrador, makeRequest, "http://www.goglobal.travel/MakeRequest");
        } catch (Exception ex) {
            Logger.getLogger(GoGlobalController.class.getName()).log(Level.SEVERE, null, ex);
            throw new ErrorException(integrador, GoGlobalClient.class, "rootRelatorioRQ", WSMensagemErroEnum.GENMETHOD, "Erro na chamada do metodo rootReservaRQ", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
        }
        return root;
    }
}
