package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String numbers){
        // Handle empty or null input
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        // Placeholder return to handle non-empty cases later
        return -1;
    }
}
