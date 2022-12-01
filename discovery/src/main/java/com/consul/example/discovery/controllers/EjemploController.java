package com.consul.example.discovery.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class EjemploController {
    
    private static final Logger log = LoggerFactory.getLogger(EjemploController.class);

    @RequestMapping("/test")
    public String ejemploConsul() {
	log.info("ingresó");
	return "Hello world";
    }
}
