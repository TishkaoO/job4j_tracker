package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int w) {
        return w / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + divide(s) + multiply(s) + minus(s);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result1 = Calculator.minus(7);
        System.out.println(result1);
        int rsl2 = calculator.divide(2);
        System.out.println(rsl2);
        int rsl3 = calculator.sumAllOperation(6);
        System.out.println(rsl3);
    }
}
