/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.Cangooroov2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author william
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Credential {

    @JsonProperty("Username")
    private String username;
    
    @JsonProperty("Password")
    private String password;

}
