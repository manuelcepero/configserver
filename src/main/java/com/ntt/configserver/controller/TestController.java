/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntt.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manuel
 */
@RestController
public class TestController {
    
   // @Value("${some.value}")
   // private String myvalue;
    
    @GetMapping(path="/myvalue")
    public String myValue(){
       // return this.myvalue;
       return "Hola";
    }
}
