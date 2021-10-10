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
public class Reservation {
    
    @JsonProperty("BookingDate")
    private String bookingDate;
    
    @JsonProperty("BookingId")
    private Integer bookingId;
    
    @JsonProperty("ClienteId")
    private Integer clienteId;
    
    @JsonProperty("ExternalReference")
    private String externalReference;
    
    @JsonProperty("LastUpdate")
    private String lastUpdate;
    
    @JsonProperty("MainPax")
    private String mainPax;
    
    @JsonProperty("Price")
    private ValuesDouble price;
    
    @JsonProperty("ServiceDate")
    private String serviceDate;
    
    @JsonProperty("ServiceId")
    private String serviceId;
    
    @JsonProperty("ServiceType")
    private String serviceType;
            
    @JsonProperty("Status")
    private String status;

}
