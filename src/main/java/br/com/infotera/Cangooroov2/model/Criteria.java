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
public class Criteria {
    
    @JsonProperty("DestinationId")
    private String destinationId;
    
    @JsonProperty("CheckinDate")
    private String checkInDate;
    
    @JsonProperty("NumNights")
    private Integer numNights;
    
    @JsonProperty("Filters")
    private Filters filters;
    
    @JsonProperty("HotelsIds")
    private List<Integer> hotelsIds;
    
    @JsonProperty("MainPaxCountryCodeNationality")
    private String mainPaxCountryCodeNationality;
    
    @JsonProperty("ReturnExtendedHotelStaticData")
    private Boolean returnExtendedHotelStaticData;
    
    @JsonProperty("ReturnHotelStaticData")
    private Boolean returnHotelStaticData;
    
    @JsonProperty("ReturnOnRequestRooms")
    private Boolean returnOnRequestRooms;
    
    @JsonProperty("SearchRooms")
    private List<SearchRoom> searchRooms;

}
