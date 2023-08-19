package dev.babatunde.recordconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan(basePackages = "dev.babatunde.recordconfigdemo")
@SpringBootApplication
public class RecordConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordConfigDemoApplication.class, args);
	}

}
