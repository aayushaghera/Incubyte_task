package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

@Component
public class SpringCalculator {

    public int add(String input) {
        // input string of numbers
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Normalize delimiters (replace newlines with commas)
        String[] numbers = normalizeAndSplitInput(input);

        // Parse and sum
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }

        return sum;
    }

    private String[] normalizeAndSplitInput(String input) {
        // Replace newline with comma for unified processing
        input = input.replace("\n", ",");
        return input.split(",");
    }
}

