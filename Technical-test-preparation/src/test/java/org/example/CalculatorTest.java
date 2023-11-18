package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void CalculatorInitializer(){
        calculator=new Calculator();
    }
    @Test
    void emptyStringTest() throws IllegalFormOfString {
        assertEquals(0,calculator.calculate("0"));
    }
    @Test
    void StringOfOneNumbersTest() throws IllegalFormOfString {
        assertEquals(2,calculator.calculate("2"));
    }
    @Test
    void StringOfTwoNumbersTest() throws IllegalFormOfString {
        assertEquals(3,calculator.calculate("2,1"));
    }
    @Test
    void StringOfUnknownNumbersTest() throws IllegalFormOfString {
        assertEquals(6,calculator.calculate("2,1,1,2"));
    }
    @Test
    void StringOfUnknownNumbersWithNewLinesTest() throws IllegalFormOfString {
        assertEquals(6,calculator.calculate("2,1\n3"));
    }
    @Test
    void validateSeparatorNotAtTheEnd(){
         assertThrows(IllegalFormOfString.class, ()->{calculator.calculate("2,1,");});
    }
    @Test
    void changeDelimiterTest() throws IllegalFormOfString {
        assertEquals(3,calculator.calculate("//|\n3|1"));
    }

}
