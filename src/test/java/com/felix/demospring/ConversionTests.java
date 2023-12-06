package com.felix.demospring;

import com.felix.demospring.conversion.ConversionConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.ConversionService;

import java.time.LocalDate;

public class ConversionTests {

    @Test
    void testConversion(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConversionConfig.class);

        ConversionService conversionService = context.getBean(ConversionService.class);
        LocalDate localDate = conversionService.convert("2010/10/05", LocalDate.class);

        Assertions.assertEquals(localDate, "2010-10-05");
    }

}
