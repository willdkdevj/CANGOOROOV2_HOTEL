/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.Cangooroov2.ws;

import br.com.infotera.Cangooroov2.model.Hotel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *
 * @author William Dias
 */
public class SearchRS {
    
    @SerializedName("TimeSpan")
    private String timeSpan;
    
    @SerializedName("Token")
    private String token;
    
    @SerializedName("TotalTime")
    private Double totaltime;
    
    @SerializedName("Hotels")
    private List<Hotel> hotels;
    
    @SerializedName("TotalHotelResults")
    private String TotalHotelResults;

    public SearchRS() {
        super();
    }

    public SearchRS(String timeSpan, String token, Double totaltime, List<Hotel> hotels, String TotalHotelResults) {
        this.timeSpan = timeSpan;
        this.token = token;
        this.totaltime = totaltime;
        this.hotels = hotels;
        this.TotalHotelResults = TotalHotelResults;
    }

    public String getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Double totaltime) {
        this.totaltime = totaltime;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public String getTotalHotelResults() {
        return TotalHotelResults;
    }

    public void setTotalHotelResults(String TotalHotelResults) {
        this.TotalHotelResults = TotalHotelResults;
    }   
    
}
