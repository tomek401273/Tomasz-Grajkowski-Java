package com.kodilla.rps.state;

import com.kodilla.rps.GameContext;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNumberVictory implements State {
    GameContext gameContext;

    public GetNumberVictory(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    Pattern numbernPattern = Pattern.compile("\\d+");

    @Override
    public void writeMessage() {
        System.out.println("How many rounds will be victory?");
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        if(numbernPattern.matcher(dane).matches()){
            gameContext.setVictory(Integer.parseInt(dane));

            System.out.println("Get Numbers Vicory: "+ gameContext.getName()+"  Vicory will be after: "+ gameContext.getVictory());
            return true;
        }
        return false;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return Collections.singletonMap(numbernPattern,new GetUserAttribute(gameContext));

    }
}
