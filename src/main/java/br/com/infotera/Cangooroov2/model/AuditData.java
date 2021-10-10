/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.Cangooroov2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author William Dias
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AuditData {
    private String processTime;
    private String timestamp;
    private String requestHost;
    private String serverId;
    private String environment;
    private String release;
    private String token;
    private String internal;

}
