package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] parts = numbers.split(",");
        if (parts.length == 1) {
            return Integer.parseInt(parts[0].trim());
        }

        return -1; // to be updated in next step
    }


}
