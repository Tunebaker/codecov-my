package calculator;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class CalculatorTest extends TestCase {

    
    private static final double DELTA = 0.001;

    public void testMultiply() {
        assertEquals(Calculator.multiply(1, 2), 2.0, DELTA);
        assertEquals(Calculator.multiply(1.0, 2.0), 2.0, DELTA);
        assertEquals(Calculator.multiply(0, 2.0), 0.0, DELTA);
        assertEquals(Calculator.multiply(2.0, 0), 0.0, DELTA);
        assertEquals(Calculator.multiply(-4, 2.0), -8.0, DELTA);
    }

}