package ua.mycompany.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void shouldReturnBubbleSortArray() {
        int[] array = new int[]{3, 5, 0, -1};
        int[] sortArray = new int[]{-1, 0, 3, 5};

        new BubbleSort().sort(array);
        assertArrayEquals(sortArray, array);
    }

    @Test(expected = NullPointerException.class)
    public void throwExceptionNullBubbleArraySort() {
        int[] arrayNull = null;
        new BubbleSort().sort(arrayNull);
    }

}