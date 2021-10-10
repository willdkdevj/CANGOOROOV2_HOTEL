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
 * @author William
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Commission {

    @JsonProperty("Currency")
    private String currency;
    
    @JsonProperty("Value")
    private Double value;
}
