package com.kodilla.rps;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNumberVictory implements State{

    Pattern numbernPattern = Pattern.compile("\\d+");

    @Override
    public void writeMessage() {
        System.out.println("How many rounds will be victory?");
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        if(numbernPattern.matcher(dane).matches()){
            return true;
        }
        return false;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
//        Collections.singletonMap(numbernPattern,)
        return null;
    }
}
