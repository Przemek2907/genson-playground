package com.pzochowski.baeldungdemo.controllers;

import com.pzochowski.baeldungdemo.dto.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class SampleController {

    @GetMapping
    public PersonDto createPersonDto() {
        return new PersonDto();
    }
}
