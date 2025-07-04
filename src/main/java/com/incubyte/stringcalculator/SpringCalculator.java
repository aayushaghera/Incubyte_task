package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String numbers){
        //No handling yet
        return Integer.parseInt(numbers);
    }
}
