/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.Cangooroov2.ws;

import br.com.infotera.Cangooroov2.model.Credential;
import br.com.infotera.Cangooroov2.model.Criteria;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author william
 */
public class SearchRQ {
    
    @SerializedName("Credential")
    private Credential credential;
    
    @SerializedName("Criteria")
    private Criteria criteria;

    public SearchRQ() {
    }

    public SearchRQ(Credential credential, Criteria criteria) {
        this.credential = credential;
        this.criteria = criteria;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }
    
    
}
