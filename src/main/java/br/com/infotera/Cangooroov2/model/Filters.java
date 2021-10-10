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
public class Filters {
    
    @JsonProperty("CheapestRoomOnly")
    private Boolean cheapestRoomOnly;
    
    @JsonProperty("MaxPrice")
    private Double maxPrice;
    
    @JsonProperty("MinPrice")
    private Double minPrice;

}
