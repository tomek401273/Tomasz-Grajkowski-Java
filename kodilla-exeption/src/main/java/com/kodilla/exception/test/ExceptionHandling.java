package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
          String proably = secondChallenge.probablyIWillThrowException(1,2);
            System.out.println(proably);
        } catch (Exception e) {
            System.out.println("We have error: "+e);
            System.out.println("Something go wrong, Check inserted numers and try again");
        }finally {
            System.out.println("Check1");

        }
        System.out.println();

        try {
           String proably = secondChallenge.probablyIWillThrowException(1,1.5);
            System.out.println(proably);
        } catch (Exception e) {
            System.out.println("We have error: "+e);
            System.out.println("Something go wrong, Check inserted numers and try again");
        } finally {
            System.out.println("Check2");

        }

    }
}
