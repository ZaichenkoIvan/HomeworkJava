package ua.mycompany.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] array;
    int[] sortArray;
    int[] arrayNull;

    @Before
    public void setUp() {
        array = new int[]{3, 5, 0, -1};
        sortArray = new int[]{-1, 0, 3, 5};
        arrayNull = null;
    }

    @Test
    public void shouldReturnInsertionSortArray() {
        new InsertionSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionNullInsertionArraySort() {
        new InsertionSort().sort(arrayNull);
    }

}