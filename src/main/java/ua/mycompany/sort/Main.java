package ua.mycompany.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = Helper.generatorArray();
        Sorting bubble = new BubbleSort();
        outputSort(bubble,array);

        array = Helper.generatorArray();
        Sorting insertion = new InsertionSort();
        outputSort(insertion,array);

        array = Helper.generatorArray();
        Sorting selection = new SelectionSort();
        outputSort(selection,array);

    }

    private static void outputSort(Sorting sort, int[]array) {

        System.out.println(Arrays.toString(array));

        sort.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println();

    }

}
