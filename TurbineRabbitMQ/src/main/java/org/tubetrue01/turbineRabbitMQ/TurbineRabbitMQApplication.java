package org.tubetrue01.turbineRabbitMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableTurbineStream
@SpringBootApplication
public class TurbineRabbitMQApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineRabbitMQApplication.class, args);
	}

}
