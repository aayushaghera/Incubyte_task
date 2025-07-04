package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String numbers){
        return (numbers == null || numbers.isEmpty()) ? 0 : -1;
    }
}
