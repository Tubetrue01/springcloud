package org.tubetrue01.consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Consumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer1Application.class, args);
	}

}
