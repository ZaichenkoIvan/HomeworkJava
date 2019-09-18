package ua.mycompany.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopFibonacciTest {
    @Test
    public void shouldReturnNumberLoopFibonacci() {
        int actual = new LoopFibonacci().findValueFibonacci(6);

        assertEquals(8, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionLoopFibonacci() {
        new LoopFibonacci().findValueFibonacci(-6);
    }
}