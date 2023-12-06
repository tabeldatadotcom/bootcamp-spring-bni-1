package com.felix.demospring;

import com.felix.demospring.loadResource.LoadResourceConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoadUserTests {

    @Test
    void testLoadResource(){
        ApplicationContext context = new AnnotationConfigApplicationContext(LoadResourceConfig.class);

        String text = "testing from resource";
        String resourceText = context.getBean(String.class);

        Assertions.assertEquals(text, resourceText);

    }

}
