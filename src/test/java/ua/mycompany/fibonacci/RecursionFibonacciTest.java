package ua.mycompany.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionFibonacciTest {

    @Test
    public void shouldReturnNumberRecursionFibonacci() {
        int actual = new RecursionFibonacci().findValueFibonacci(6);

        assertEquals(8, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionRecursionFibonacci() {
        new RecursionFibonacci().findValueFibonacci(-6);
    }

}