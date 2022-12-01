package com.discovery.consumer.discovery.consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Devs4jLoadBalancerConfiguration {

	private static final Logger log = LoggerFactory.getLogger(Devs4jLoadBalancerConfiguration.class);

	@Bean
	public ServiceInstanceListSupplier discoveryClientServiceInstanceListSupplier(
			ConfigurableApplicationContext context) {
		log.info("Configuring Load balancer");
		return ServiceInstanceListSupplier.
				builder()
				.withBlockingDiscoveryClient()
				.withCaching()
				.withRetryAwareness()
				.build(context);
	}

	
	/*
	
	@Bean
	public ServiceInstanceListSupplier discoveryClientServiceInstanceListSupplier(
			ConfigurableApplicationContext context) {
		log.info("Configuring Loadbalancer to prefer same instance");
		return ServiceInstanceListSupplier.
				builder().withBlockingDiscoveryClient().
				withSameInstancePreference()
				.build(context);
	}


	 * */
	
	
	
	
	
	
	
}
