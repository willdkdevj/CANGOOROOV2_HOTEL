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
 * @author william
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SearchBookingCriteria {
    
    @JsonProperty("BookingNumber")
    private List<Integer> bookingNumber;
    
    @JsonProperty("BookingStatus")
    private List<String> bookingStatus;
    
    @JsonProperty("CancelationDateEnd")
    private String cancelationDateEnd;
    
    @JsonProperty("CancelationDateStart")
    private String cancelationDateStart;
    
    @JsonProperty("ExternalReference")
    private String externalReference;
    
    @JsonProperty("FinalBookingDate")
    private String finalBookingDate;
    
    @JsonProperty("FinalServiceDate")
    private String finalServiceDate;
    
    @JsonProperty("FinalUpdateDate")
    private String finalUpdateDate;
    
    @JsonProperty("IninalBookingDate")
    private String ininalBookingDate;
    
    @JsonProperty("InitialServiceDate")
    private String initialServiceDate;
    
    @JsonProperty("InitialUpdateDate")
    private String initialUpdateDate;
    
    @JsonProperty("PassengerName")
    private String passengerName;
    
    @JsonProperty("PaymentDeadlineEnd")
    private String paymentDeadlineEnd;
    
    @JsonProperty("PaymentDeadlineStart")
    private String paymentDeadlineStart;
    
    @JsonProperty("ServiceTypes")
    private List<String> serviceTypes;

}
