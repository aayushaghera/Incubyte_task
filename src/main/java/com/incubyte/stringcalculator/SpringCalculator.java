package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class SpringCalculator {

    public int add(String input) {
        // input string of numbers
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Normalize delimiters and split numbers
        String[] numbers = normalizeAndSplitInput(input);

        // Parse and sum
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }

        return sum;
    }

    private String[] normalizeAndSplitInput(String input) {
        String delimiter = ",";

        // Support custom delimiter format: "//<delimiter>\n<rest>"
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\n");
            delimiter = input.substring(2, delimiterEndIndex);
            input = input.substring(delimiterEndIndex + 1);
        }

        // Replace newline with comma
        input = input.replace("\n", delimiter);

        // split by delimiter
        return input.split(Pattern.quote(delimiter));
    }
}
