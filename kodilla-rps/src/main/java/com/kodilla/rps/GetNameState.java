package com.kodilla.rps;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNameState implements State{

    @Override
    public void writeMessage() {
        System.out.println("Write your name");
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        return !dane.equals("");
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return  Collections.singletonMap(Pattern.compile(".*"),new GetNumberVictory());
    }
}
