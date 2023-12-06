package com.felix.demospring;

import com.felix.demospring.config.BeanConfiguration;
import com.felix.demospring.config.DemoConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTests {

    @Test
    void testBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertNotNull(context);
    }

}
