package com.felix.demospring;

import com.felix.demospring.config.DIConfiguration;
import com.felix.demospring.model.Bike;
import com.felix.demospring.model.Car;
import com.felix.demospring.model.CarBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DIConfigurationTests {

    @Test
    void testDI(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);

        Car car = context.getBean(Car.class);
        Bike bike = context.getBean(Bike.class);
        CarBike carBike = context.getBean(CarBike.class);

        Assertions.assertSame(car, carBike.getCar());
        Assertions.assertSame(bike, carBike.getBike());
    }

}
