package com.target.services.productApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.common.base.Predicates;
import com.target.services.productApi.model.CurrentPrice;
import com.target.services.productApi.model.ProductPrice;
import com.target.services.productApi.repository.ProductRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableRedisRepositories
@EnableSwagger2

public class MyReatilProductApiApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MyReatilProductApiApplication.class);
    @Autowired
    ProductRepository productRepository;
	
	
   public static void main(String[] args) {
   	log.info("Start");
       SpringApplication.run(MyReatilProductApiApplication.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
     
   	productRepository.save(new ProductPrice("1",new CurrentPrice(14.23,"USD")));
 

	}
   
   @Bean
   public RestTemplate restTemplate() {
       return new RestTemplate();
   }
   
   @Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select()

				.apis(RequestHandlerSelectors.basePackage("springbootex.controller"))
			    .paths(Predicates.not(PathSelectors.regex("test"))).build();

	}

}
