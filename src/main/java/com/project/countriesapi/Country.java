/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.countriesapi;

import java.util.List;

/**
 *
 * @author Chatcharit
 */
public class Country {
    
    private String isoName;
    private String name;
    private String continent;
    private String currencyCode;
    private String currencyName;
    private String currencySymbol;
    private String flag;
    private List<String> callingCodes;

    public Country() {
    }

    
    public Country(String isoName, String name, String continent, String currencyCode, String currencyName, String currencySymbol, String flag, List<String> callingCodes) {
        this.isoName = isoName;
        this.name = name;
        this.continent = continent;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
        this.flag = flag;
        this.callingCodes = callingCodes;
    }

    public String getIsoName() {
        return isoName;
    }

    public void setIsoName(String isoName) {
        this.isoName = isoName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }
    
    
    
}
