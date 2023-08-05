package com.SpringBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = Employee.class)
public class BeanConfig {
//    @Bean
    public Address getAddress() {
        return new Address("Muzaffarpur");
    }

    @Bean
    public String getName() {
        return "Abhishek";
    }

}
