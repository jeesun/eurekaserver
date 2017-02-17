package com.simon;

import com.simon.config.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class EurekaserverApplication {
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
