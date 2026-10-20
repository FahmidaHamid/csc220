package test;

import main.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    @Test
    void addsTwoPositiveNumbers() {
        int actual = Calculator.add(4, 5);
        assertEquals(9, actual);
    }

    @Test
    void addsTwoNegativeNumbers() {
        int actual = Calculator.add(-4, -5);
        assertEquals(-9, actual);
    }

    @Test
    void addsOnePositiveOneNegativeNumbers() {
        int actual = Calculator.add(-4, 5);
        assertEquals(1, actual);
    }

    @Test 
    void dividePositive() {
        float result = Calculator.divide(10, 5);
        assertEquals(2.0f, result);
    
    }

    @Test 
    void divideNegative() {
        float result = Calculator.divide(10, -5);
        assertEquals(-2.0f, result);
    
    }

    @Test 
    void divideByZero() {

        ArithmeticException exp = assertThrows(ArithmeticException.class, () -> {Calculator.divide(10, 0);});
        assertEquals("Division by zero is not allowed.", exp.getMessage());
    
    }
}
