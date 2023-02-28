package com.codecool.simplecalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleCalculatorTest {

    @Test
    public void testIsNumberNotValid() {
        assertFalse(SimpleCalculator.isNumber("x"));
    }

    @Test
    public void testIsNumberIntegerValid() {
        assertTrue(SimpleCalculator.isNumber("2"));
    }

    @Test
    public void testIsNumberNegativeIntegerValid() {
        assertTrue(SimpleCalculator.isNumber("-12"));
    }

    @Test
    public void testIsNumberFloatValid() {
        assertTrue(SimpleCalculator.isNumber("17.6"));
    }

    @Test
    public void testIsNumberNegativeFloatValid() {
        assertTrue(SimpleCalculator.isNumber("-99.99"));
    }

    @Test
    public void testConvertNumberInteger() {
        assertEquals(SimpleCalculator.convertNumber("15"),new Float(15));
    }

    @Test
    public void testConvertNumberNegativeInteger() {
        assertEquals(SimpleCalculator.convertNumber("-615"), new Float( -615));
    }

    @Test
    public void testConvertNumberFloat() {
        assertEquals(SimpleCalculator.convertNumber("8.88"),new Float(8.88));
    }

    @Test
    public void testConvertNumberNegativeFloat() {
        assertEquals(SimpleCalculator.convertNumber("-4.45"),new Float(-4.45));
    }

    @Test
    public void testIsValidOperatorValid1() {
        assertTrue(SimpleCalculator.isValidOperator("+"));
    }

    @Test
    public void testIsValidOperatorValid2() {
        assertTrue(SimpleCalculator.isValidOperator("-"));
    }

    @Test
    public void testIsValidOperatorValid3() {
        assertTrue(SimpleCalculator.isValidOperator("/"));
    }

    @Test
    public void testIsValidOperatorValid4() {
        assertTrue(SimpleCalculator.isValidOperator("*"));
    }

    @Test
    public void testIsValidOperatorNotValid1() {
        assertFalse(SimpleCalculator.isValidOperator("%"));
    }

    @Test
    public void testIsValidOperatorNotValid2() {
        assertFalse(SimpleCalculator.isValidOperator("t"));
    }

    @Test
    public void testCalcPlus1() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a + b), SimpleCalculator.calc("+", a, b));
    }

    @Test
    public void testCalcPlus2() {
        float a = -3;
        float b = 4;
        assertEquals((Float)(a + b), SimpleCalculator.calc("+", a, b));
    }

    @Test
    public void testCalcPlus3() {
        float a = -3;
        float b = -4;
        assertEquals((Float)(a + b), SimpleCalculator.calc("+", a, b));
    }

    @Test
    public void testCalcMinus1() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a - b), SimpleCalculator.calc("-", a, b));
    }

    @Test
    public void testCalcMinus2() {
        float a = -3;
        float b = 4;
        assertEquals((Float)(a - b), SimpleCalculator.calc("-", a, b));
    }

    @Test
    public void testCalcMinus3() {
        float a = 3;
        float b = -4;
        assertEquals((Float)(a - b), SimpleCalculator.calc("-", a, b));
    }

    @Test
    public void testCalcMinus4() {
        float a = -3;
        float b = -4;
        assertEquals((Float)(a - b), SimpleCalculator.calc("-", a, b));
    }

    @Test
    public void testCalcMultiply1() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a * b), SimpleCalculator.calc("*", a, b));
    }

    @Test
    public void testCalcMultiply2() {
        float a = -3;
        float b = 4;
        assertEquals((Float)(a * b), SimpleCalculator.calc("*", a, b));
    }

    @Test
    public void testCalcMultiply3() {
        float a = 3;
        float b = -4;
        assertEquals((Float)(a * b), SimpleCalculator.calc("*", a, b));
    }

    @Test
    public void testCalcMultiply4() {
        float a = -3;
        float b = -4;
        assertEquals((Float)(a * b), SimpleCalculator.calc("*", a, b));
    }

    @Test
    public void testCalcDivision1() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a / b), SimpleCalculator.calc("/", a, b));
    }

    @Test
    public void testCalcDivision2() {
        float a = -3;
        float b = 4;
        assertEquals((Float)(a / b), SimpleCalculator.calc("/", a, b));
    }

    @Test
    public void testCalcDivision3() {
        float a = 3;
        float b = -4;
        assertEquals((Float)(a / b), SimpleCalculator.calc("/", a, b));
    }

    @Test
    public void testCalcDivision4() {
        float a = -3;
        float b = -4;
        assertEquals((Float)(a / b), SimpleCalculator.calc("/", a, b));
    }

    @Test
    public void testCalcDivision5() {
        float a = 3;
        float b = 0;
        assertEquals(null, SimpleCalculator.calc("/", a, b));
    }

}
