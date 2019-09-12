package ua.mycompany.fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci loopFibonacci = new LoopFibonacci();
        System.out.println(loopFibonacci.findValueFibonacci(6));

        Fibonacci recursionFibonacci = new RecursionFibonacci();
        System.out.println(recursionFibonacci.findValueFibonacci(7));
    }
}
