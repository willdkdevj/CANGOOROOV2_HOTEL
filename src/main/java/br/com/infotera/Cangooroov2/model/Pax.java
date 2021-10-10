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
public class Pax {
    
    @JsonProperty("Address")
    private String address;
    
    @JsonProperty("AddressComplement")
    private String addressComplement;
    
    @JsonProperty("AddressNumber")
    private String addressNumber;
    
    @JsonProperty("Age")
    private Integer age;
    
    @JsonProperty("City")
    private String city;
    
    @JsonProperty("Cpf")
    private String cpf;
    
    @JsonProperty("Email")
    private String email;
    
    @JsonProperty("MainPax")
    private Boolean mainPax;
    
    @JsonProperty("Name")
    private String name;
    
    @JsonProperty("PhoneDDD")
    private String phoneDDD;
    
    @JsonProperty("PhoneDDI")
    private String phoneDDI;
    
    @JsonProperty("PhoneNumber")
    private String phoneNumber;
    
    @JsonProperty("State")
    private String state;
    
    @JsonProperty("Surname")
    private String surname;
    
    @JsonProperty("Title")
    private String title;
    
    @JsonProperty("ZipCode")
    private String zipCode;
    
    @JsonProperty("isChild")
    private Boolean isChild;

}
