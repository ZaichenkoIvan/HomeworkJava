package ua.mycompany.fibonacci;

import org.junit.Test;
import ua.mycompany.factorial.Factorial;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class LoopFibonacciTest {
    @Test
    public void shouldReturnNumberLoopFibonacci() {
        int actual = new LoopFibonacci().findValueFibonacci(6);

        assertEquals(8, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void throwExceptionUnvalidationLoopFibonacci() {
        new LoopFibonacci().findValueFibonacci(-6);
    }
}