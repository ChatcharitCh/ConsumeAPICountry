/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.countriesapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Chatcharit
 */
@RestController
public class CountryController {
    
    @RequestMapping("/hello")
    @ResponseBody
    private String hello(){
        return "Hello World";
    }
    
    @RequestMapping("/country/{isoName}")
    @ResponseBody
    private String getCountry(@PathVariable String isoName){
        
        String uri = "https://topups.reloadly.com/countries/" + isoName ;
        RestTemplate restTemplate = new RestTemplate();
        
        Country country = restTemplate.getForObject(uri, Country.class);
        System.out.println("Country" + country);
        
        System.out.println("isoName = " + country.getIsoName());
        System.out.println("name = " + country.getName());
        System.out.println("continent = " + country.getContinent());
        System.out.println("currencyCode = " + country.getCurrencyCode());
        System.out.println("currencyName = " + country.getCurrencyName());
        System.out.println("currencySymbol = " + country.getCurrencySymbol());
        System.out.println("flag = " + country.getFlag());
        System.out.println("callingCodes = " + country.getCallingCodes());
        
        return "Contry detail page.";
    }
}
