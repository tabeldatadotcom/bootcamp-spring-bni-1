package com.felix.demospring.config;

import com.felix.demospring.model.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class BeanConfiguration {

    @Bean
    public Car car(){
        Car car = new Car();
        log.info("Create new car object");
        return car;
    }

}
