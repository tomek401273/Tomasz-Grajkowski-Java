package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rock implements Data {

    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public List<GameAttribute> getIsStrongerThan() {
        return Arrays.asList(GameAttribute.Scissors);
    }

    @Override
    public List<GameAttribute> getIsWeekerThan() {
        return Arrays.asList(GameAttribute.Paper);
    }
}
