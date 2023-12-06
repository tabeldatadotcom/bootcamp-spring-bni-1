package com.felix.demospring;

import com.felix.demospring.value.GetValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetValueTests {

    @Test
    void testValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext(GetValue.class);

        String expectUserpass = "felix : felix1234";
        String userpass = context.getBean(String.class);

        Assertions.assertEquals(userpass, expectUserpass);
    }

}
