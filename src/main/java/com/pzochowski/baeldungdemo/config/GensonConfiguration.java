package com.pzochowski.baeldungdemo.config;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GensonConfiguration {

    @Bean
    public Genson buildGenson() {
        return new GensonBuilder()
                .useIndentation(true)
                .useRuntimeType(true)
                .useConstructorWithArguments(true)
                .setSkipNull(true)
                .create();
    }
}
