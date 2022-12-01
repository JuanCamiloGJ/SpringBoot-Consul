package com.discovery.consumer.discovery.consumer.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.discovery.consumer.discovery.consumer.Devs4jLoadBalancerConfiguration;

@FeignClient(name = "discoveryejemplo")
@LoadBalancerClient(name="discoveryejemplo",configuration = Devs4jLoadBalancerConfiguration.class)
public interface FClientDiscoveryEjemplo {
    @RequestMapping("/test")
    public String ejemploConsul();
    
}
