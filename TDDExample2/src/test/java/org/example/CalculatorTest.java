//B211202014 - Münevvernur ERASLAN
//SWE 202 SOFTWARE VERIFICATION AND VALIDATION
//2023-2024 SPRING SEMESTER HOMEWORK 1
//https://github.com/munevvernure/SWE202_hw1
package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

   /* @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(5, Calculator.divide(12.5f, 2.5f));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5f));
    }

    @Test
    void testDivision5() {
        assertEquals(2.5f, Calculator.divide(12.5f, 5));
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
    */
    static Stream<Arguments> divisionData() {
        return Stream.of(

                Arguments.of(10, 2, 5),
                Arguments.of(10, 4, 2.5f),
                Arguments.of(12.5f, 2.5f, 5),
                Arguments.of(10, 2.5f, 4),
                Arguments.of(12.5f, 5, 2.5f)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionData")
    void testDivision(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }
}