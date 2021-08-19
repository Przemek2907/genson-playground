package com.pzochowski.baeldungdemo.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class PersonDto {
    private String name;
    private Integer age;
    private final BigDecimal money = BigDecimal.TEN;
}
