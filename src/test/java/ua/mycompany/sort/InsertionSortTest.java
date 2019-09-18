package ua.mycompany.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void shouldReturnInsertionSortArray() {
        int[] array = new int[]{3, 5, 0, -1};
        int[] sortArray = new int[]{-1, 0, 3, 5};

        new InsertionSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionNullInsertionArraySort() {
        int[] arrayNull = null;
        new InsertionSort().sort(arrayNull);
    }

}