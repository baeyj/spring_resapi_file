package com.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yj.file.property.FileStorageProperties;


@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class SpringResapiFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringResapiFileApplication.class, args);
	}

}
