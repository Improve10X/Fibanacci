package TestFibanocci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void empty() {

    }

    @Test
    public void givenAnyNegativeNumberInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-5);
        assertEquals(-1, negativeFibonacci);
    }

}
