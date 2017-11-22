package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        double result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Something go wrong!!!" + e);

        } finally {
            System.out.println("Operating dividing");

        }

        return result;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        System.out.println("Divide1");
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

        System.out.println();
        System.out.println("Divide2");
        double result2 = firstChallenge.divide(3, 3);
        System.out.println(result2);
    }

}
