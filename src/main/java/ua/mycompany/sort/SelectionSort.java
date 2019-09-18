package ua.mycompany.sort;

public class SelectionSort implements Sorting {

    @Override
    public void sort(int[] array) {

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            Helper.swap(array, left, minInd);
        }
    }
}
