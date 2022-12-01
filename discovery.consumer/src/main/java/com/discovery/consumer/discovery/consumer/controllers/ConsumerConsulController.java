package com.discovery.consumer.discovery.consumer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.discovery.consumer.discovery.consumer.service.FClientDiscoveryEjemplo;

@RestController("/")
public class ConsumerConsulController {

    @Autowired
    private RestTemplate restTemplate;
    
   
    @Autowired
    private FClientDiscoveryEjemplo clientDiscoveryEjemplo;
    
    
    @GetMapping("/consume")
    public String consumerConsul() throws InterruptedException {
	String message = "Message consume with RestTemplate - ";
	for(int i = 0 ; i < 50000 ; i++ ) {
	message = this.restTemplate.getForObject("http://discoveryejemplo/test", String.class);
	}
	return message;
    }
    @GetMapping
    public String consumerConsulHello() {
	String message = "Message consume";
	
	return message;
    }
    @GetMapping("/consumefeing")
    public String consumerConsulFeing() {
	String message = "Message consume with Feign Client";
	for(int i = 0 ; i < 100000 ; i++ ) {
	message = clientDiscoveryEjemplo.ejemploConsul();
	System.out.println(i);
	}
	return message;
    }
    
}
