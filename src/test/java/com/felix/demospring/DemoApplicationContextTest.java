package com.felix.demospring;

import com.felix.demospring.config.DemoConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplicationContextTest {

    @Test
    void testDemoConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
