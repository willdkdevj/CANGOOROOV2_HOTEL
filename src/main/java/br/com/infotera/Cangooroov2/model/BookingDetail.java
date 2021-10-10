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
public class BookingDetail {
    
    @JsonProperty("BookingNumber")
    private Integer bookingNumber;
    
    @JsonProperty("CNPJ")
    private String cnpj;
    
    @JsonProperty("Cars")
    private List<String> cars;
    
    @JsonProperty("ClientID")
    private Integer clientID;
    
    @JsonProperty("ClientName")
    private String clientName;
    
    @JsonProperty("Flights")
    private List<String> flights;
    
    @JsonProperty("Insurances")
    private List<String> insurances;
    
    @JsonProperty("NumberOfBookingRooms")
    private Integer numberOfBookingRooms;
    
    @JsonProperty("OperatorName")
    private String operatorName;
    
    @JsonProperty("Package")
    private List<String> packageList;
    
    @JsonProperty("Rooms")
    private List<Room> rooms;
    
    @JsonProperty("Tours")
    private List<String> tours;
    
    @JsonProperty("Transfers")
    private List<String> transfers;

}
