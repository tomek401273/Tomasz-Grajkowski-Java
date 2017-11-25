package com.kodilla.rps;

import java.util.Arrays;

public class GenerateAtribute {

    public GameAttribute generete() {
        int x = (int) (Math.random() * 3 + 1);
        return Arrays.stream(GameAttribute.values())
                .filter(gameAttribute -> gameAttribute.id == x)
                .findFirst()
                .get();
    }
}
