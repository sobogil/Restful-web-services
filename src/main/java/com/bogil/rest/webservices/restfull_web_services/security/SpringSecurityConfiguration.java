package com.bogil.rest.webservices.restfull_web_services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


public class SpringSecurityConfiguration {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //모든 페이지는 authenticted되야 한다.
        http.authorizeHttpRequests((auth -> auth.anyRequest().authenticated()));

        http.httpBasic(withDefaults());
        return http.build();
    }
}
