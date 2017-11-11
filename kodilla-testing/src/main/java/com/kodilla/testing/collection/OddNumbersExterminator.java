package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers2 = (ArrayList<Integer>) numbers.clone();

        for (int i = 0; i < numbers2.size(); i++) {
            int number = numbers2.get(i);
            if (number % 2 != 0) {
                numbers2.remove(i);
            }
        }

        return numbers2;
    }
}
