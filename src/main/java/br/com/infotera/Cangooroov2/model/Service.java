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

import java.util.List;

/**
 *
 * @author William Dias
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Service {
    
    @JsonProperty("QtyMax")
    private Integer qtyMax;
    
    @JsonProperty("QtyMin")
    private Integer qtyMin;
    
    @JsonProperty("Services")
    private List<SubService> services;
    
    @JsonProperty("Type")
    private String type;

}
