package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOpperations {
    static OptionalDouble getAverage(int[] numbers) {


        System.out.println("lenhth numbers: " + numbers.length);

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        //jak tutaj użyję average to nażuca mi zamiast double OptionalDouble


        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        System.out.println("Average numbers: " + average);

        return average;
    }
}
