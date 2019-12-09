package org.tubetrue01.sleuthZipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SleuthZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinApplication.class, args);
	}

}
