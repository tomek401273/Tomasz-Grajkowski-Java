package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scissors implements Data{

    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public List<GameAttribute> getIsStrongerThan() {
        return Arrays.asList(GameAttribute.Paper);
    }

    @Override
    public List<GameAttribute> getIsWeekerThan() {
        return Arrays.asList(GameAttribute.Rock);
    }

}
