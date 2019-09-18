package ua.mycompany.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void shouldReturnSelectionSortArray() {
        int[] array = new int[]{3, 5, 0, -1};
        int[] sortArray = new int[]{-1, 0, 3, 5};

        new SelectionSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionNullSelectionArraySort() {
        int[] arrayNull = null;
        new SelectionSort().sort(arrayNull);
    }

}