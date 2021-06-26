package com.nyash.rooms.roomsreservationservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class RoomsReservationServicesApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Reservations").select()
                .apis(RequestHandlerSelectors.basePackage("com.frankmoley.services.reservation"))
                .paths(any()).build().apiInfo(new ApiInfo("Reservation Services",
                        "A set of services to provide data access to reservations", "1.0.0", null,
                        null,null, null));
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomsReservationServicesApplication.class, args);
    }

}
