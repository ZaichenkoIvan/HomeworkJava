package ua.mycompany.sort;

import java.util.Random;

final class Helper {

    private static final int LENGTH_ARRAY = 5;

    static int[] generatorArray() {
        int array[] = new int[LENGTH_ARRAY];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    static void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
