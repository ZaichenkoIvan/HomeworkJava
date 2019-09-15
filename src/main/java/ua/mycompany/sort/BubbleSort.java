package ua.mycompany.sort;

public class BubbleSort implements Sorting {

    public void sort(int[] array) {
        if (array == null)
            throw new NullPointerException();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1])
                    Helper.swap(array, j, j + 1);
            }
        }
    }
}
