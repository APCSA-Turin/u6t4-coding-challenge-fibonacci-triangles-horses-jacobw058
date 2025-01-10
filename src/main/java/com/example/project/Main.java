package com.example.project;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);
        Fibonacci[] fibonaccis = new Fibonacci[3];
        fibonaccis[0] = fib0;
        fibonaccis[1] = fib1;
        fibonaccis[2] = fib2;
        for (Fibonacci fib : fibonaccis) {
            System.out.println(fib.getSequence().length);
        }
    }
}
