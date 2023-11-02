package homework.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void add() {
        int a = 45;
        int b = 30;
        assertEquals(75, calculator.add(a, b));
    }
    @Test
    void subtract() {
        int a = 45;
        int b = 30;
        assertEquals(15, calculator.subtract(a, b));
    }
    @Test
    void multiply() {
        int a = 45;
        int b = 30;
        assertEquals(1350, calculator.multiply(a, b));
    }
    @Test
    void divideWithRemainder() {
        int a = 45;
        int b = 30;
        assertEquals(15, calculator.divideWithRemainder(a, b));
    }
    @Test
    void divide() {
        int a = 45;
        int b = 30;
        assertEquals(1, calculator.divide(a, b));
    }
}