package com.felix.demospring.config;

import com.felix.demospring.model.Bike;
import com.felix.demospring.model.Car;
import com.felix.demospring.model.CarBike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration
public class DIConfiguration {

    @Bean
    @Primary
    public Car car(){
        return new Car();
    }

    @Bean
    public Car car2(){
        return new Car();
    }

    @Bean
    public Bike bike(){
        return new Bike();
    }

    @Bean
    @DependsOn({"car", "bike"})
    public CarBike carBike(Car car, Bike bike){
        return new CarBike(car, bike);
    }

}
