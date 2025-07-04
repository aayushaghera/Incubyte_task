package com.incubyte.stringcalculator;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
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

        // Parse, validate, and sum
        int sum = 0;
        List<String> negativeNumbers = new ArrayList<>();

        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            if (num < 0) {
                negativeNumbers.add(String.valueOf(num));
            }
            sum += num;
        }

        // Throw exception if any negative numbers found
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + String.join(", ", negativeNumbers));
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

        // Replace newline with delimiter
        input = input.replace("\n", delimiter);

        // split using regex escape
        return input.split(Pattern.quote(delimiter));
    }
}
