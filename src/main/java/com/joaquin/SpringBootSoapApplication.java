package com.joaquin;

import com.joaquin.client.SoapClient;
import com.joaquin.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}
//
//	@Bean
//	CommandLineRunner init(SoapClient soapClient){
//		return args -> {
//			AddResponse addResponse = soapClient.getAddResponse(2,2);
//
//			LOGGER.info("el resultado de la suma de {} y {} es: {}", 2, 2, addResponse.getAddResult());
//
//		};
//	}

}
