package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        System.out.println("Divide1");
        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Arthmetic Exception: " + e);
        }finally {
            System.out.println("Arthemtic operation 1");
        }
        System.out.println();

        System.out.println("Divide2");
        try{
            double result2 = firstChallenge.divide(3, 3);
            System.out.println(result2);
        } catch (ArithmeticException e){
            System.out.println("Arthmetic Exception: "+e);
        }finally {
            System.out.println("Arthmetic operation 2");
        }
        System.out.println();


    }

}
