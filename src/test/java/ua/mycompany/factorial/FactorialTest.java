package ua.mycompany.factorial;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void shouldReturnFactorialOfBigInteger() {
        BigInteger expected = BigInteger.valueOf(5040);
        BigInteger actual = Factorial.factorial(BigInteger.valueOf(7));

        assertEquals(expected, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void throwExceptionUnvalidationFactorial() {
        BigInteger number = BigInteger.valueOf(-3);
        Factorial.factorial(number);
    }
}