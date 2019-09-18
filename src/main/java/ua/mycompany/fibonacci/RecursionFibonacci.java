package ua.mycompany.fibonacci;

public class RecursionFibonacci implements Fibonacci {

    public int findValueFibonacci(int numberFibonacci) {
        if (numberFibonacci < 0) {
            throw new IllegalArgumentException("NumberFibonacci must be positive");
        }

        if (numberFibonacci == 0) {
            return 0;
        } else if (numberFibonacci == 1) {
            return 1;
        } else {
            return findValueFibonacci(numberFibonacci - 1) +
                    findValueFibonacci(numberFibonacci - 2);

        }
    }
}
