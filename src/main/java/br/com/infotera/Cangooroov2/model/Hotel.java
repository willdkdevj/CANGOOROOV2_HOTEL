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
public class Hotel {
    
    @JsonProperty("Address")
    private String address = "30, Leinster Gardens";
    
    @JsonProperty("Categoria")
    private String categoria = "4";
    
    @JsonProperty("HotelId")
    private Integer hotelId = 1090;
    
    @JsonProperty("Latitude")
    private Double latitude = 51.512947082519531;
    
    @JsonProperty("Longitude")
    private Double longitude = -0.18359099328517903;
    
    @JsonProperty("Name")
    private String name = "Blakemore Hyde Park (Londres, Inglaterra, Reino Unido)";
    
    @JsonProperty("Rooms")
    private List<Room> rooms;
    
    @JsonProperty("Criteria")
    private String thumbUrl ="https://i.t4w.mobi/hi/1090_2607_154_b.jpg";

}
