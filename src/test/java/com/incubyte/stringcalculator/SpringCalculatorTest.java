package com.incubyte.stringcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
