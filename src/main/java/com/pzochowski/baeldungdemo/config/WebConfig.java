package com.pzochowski.baeldungdemo.config;

import com.owlike.genson.Genson;
import com.owlike.genson.ext.spring.GensonMessageConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final Genson genson;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        log.debug("Setting genson converter");
        GensonMessageConverter gensonJsonConverter = new GensonMessageConverter(genson);
        converters.add(gensonJsonConverter);
    }
}
