package com.felix.demospring.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class GetValue {

    private String username;
    private String password;

    public GetValue(@Value("${user.username}") String username, @Value("${user.password}") String password) {
        this.username = username;
        this.password = password;
    }

    @Bean
    public String getValueUser(){
        String userpass = username + " : " + password;
        return userpass;
    }
}
