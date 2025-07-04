package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
