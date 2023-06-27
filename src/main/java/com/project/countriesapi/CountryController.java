/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.countriesapi;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

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
    private ModelAndView getCountry(@PathVariable String isoName, Model model){
        
        String uri = "https://topups.reloadly.com/countries/" + isoName ;
        RestTemplate restTemplate = new RestTemplate();
        
        Country country = restTemplate.getForObject(uri, Country.class);
        System.out.println("Country" + country);
        
        ModelAndView modelAndView = new ModelAndView("country");
        modelAndView.addObject("country", country );
        
        
        return modelAndView;
    }
}
