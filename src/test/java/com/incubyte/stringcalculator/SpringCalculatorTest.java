package com.incubyte.stringcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SpringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenInputIsEmpty() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("");

        // Then
        assertEquals(0,result);
    }

    @Test
    public void shouldReturnSameNumberWhenInputHasSingleNumber() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("4");

        // Then
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnSumWhenInputHasTwoCommaSeparatedNumbers() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("1,5");

        // Then
        assertEquals(6, result);
    }

    @Test
    public void shouldReturnSumForMultipleCommaSeparatedNumbers() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("1,2,3,4");

        // Then
        assertEquals(10, result);
    }

    @Test
    public void shouldSupportNewLineAsDelimiter() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("1\n2,3");

        // Then
        assertEquals(6, result);
    }

    @Test
    public void shouldSupportCustomDelimiterDefinedInInput() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When
        int result = calculator.add("//;\n1;2");

        // Then
        assertEquals(3, result);
    }

    @Test
    public void shouldThrowExceptionWhenNegativeNumberIsPassed() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When & Then
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("1,-2,3")
        );

        assertEquals("negative numbers not allowed: -2", exception.getMessage());
    }

    @Test
    public void shouldShowAllNegativeNumbersInExceptionMessage() {
        // Given
        SpringCalculator calculator = new SpringCalculator();

        // When & Then
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("1,-2,3,-5")
        );

        assertEquals("negative numbers not allowed: -2, -5", exception.getMessage());
    }

}
