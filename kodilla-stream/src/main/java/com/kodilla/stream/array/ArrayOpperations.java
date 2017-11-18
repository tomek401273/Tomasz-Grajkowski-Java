package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOpperations {
    static double getAverage(int[] numbers) {


        System.out.println("lenhth numbers: " + numbers.length);

        double average = IntStream.range(1, numbers.length + 1)
                .sum() / numbers.length;
        //jak tutaj użyję average to nażuca mi zamiast double OptionalDouble


        IntStream.range(1, numbers.length + 1)
                .forEach(System.out::println);

        System.out.println("Average numbers: " + average);

        return average;
    }
}
