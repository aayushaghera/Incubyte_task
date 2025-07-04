package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }

        return -1; // placeholder for upcoming logic
    }

}
