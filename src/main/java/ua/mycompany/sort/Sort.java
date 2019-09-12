package ua.mycompany.sort;

public abstract class Sort {

    protected int[] array;

    Sort() {
    }

    Sort(int[] array) {
        this.array = array;
    }

    int[] getArray() {
        return array;
    }

    public abstract void sort();

    protected void swap(int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
