package ua.mycompany.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = GeneratorArray.generatorArray();
        Sort bubble = new BubbleSort(array);
        outputSort(bubble);

        array = GeneratorArray.generatorArray();
        Sort insertion = new InsertionSort(array);
        outputSort(insertion);

        array = GeneratorArray.generatorArray();
        Sort selection = new SelectionSort(array);
        outputSort(selection);

    }

    private static void outputSort(Sort sort) {

        System.out.println(Arrays.toString(sort.getArray()));

        sort.sort();

        System.out.println(Arrays.toString(sort.getArray()));
        System.out.println();

    }

}
