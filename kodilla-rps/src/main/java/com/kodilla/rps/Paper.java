package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paper implements Data {

    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public List<GameAttribute> getIsStrongerThan() {
        return Arrays.asList(GameAttribute.Rock);
    }

    @Override
    public List<GameAttribute> getIsWeekerThan() {
        return Arrays.asList(GameAttribute.Scissors);
    }

}
