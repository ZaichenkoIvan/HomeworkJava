package ua.mycompany.fibonacci;

public class LoopFibonacci implements Fibonacci {

    private int firstTempFibonacci = 0;
    private int secondTempFibonacci = 1;

    public LoopFibonacci() {
    }

    public int findValueFibonacci(int numberFibonacci) {
        if(numberFibonacci <0)
            throw new UnsupportedOperationException();

        for (int i = 0; i <= numberFibonacci-2; i++) {
            int sumTempFibonacci = firstTempFibonacci + secondTempFibonacci;
            firstTempFibonacci = secondTempFibonacci;
            secondTempFibonacci = sumTempFibonacci;
        }
        return secondTempFibonacci;
    }
}
