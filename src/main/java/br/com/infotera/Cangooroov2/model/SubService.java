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
 * @author William Dias
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SubService {
    
    @JsonProperty("CanSelectFirstDay")
    private Boolean canSelectFirstDay;
    
    @JsonProperty("Commission")
    private ValuesDouble commission;
    
    @JsonProperty("Description")
    private String description;
    
    @JsonProperty("ID")
    private String id;
    
    @JsonProperty("Name")
    private String name;
    
    @JsonProperty("Price")
    private ValuesDouble price;

}
