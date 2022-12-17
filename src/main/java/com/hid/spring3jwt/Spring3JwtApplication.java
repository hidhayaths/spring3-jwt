package com.hid.spring3jwt;

import com.hid.spring3jwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class Spring3JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3JwtApplication.class, args);
	}

}
