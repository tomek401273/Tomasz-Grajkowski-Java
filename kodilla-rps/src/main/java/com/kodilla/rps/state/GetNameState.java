package com.kodilla.rps.state;

import com.kodilla.rps.GameContext;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNameState implements State {
    GameContext gameContext;

    public GetNameState(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    @Override
    public void writeMessage() {
        System.out.println("Write your name");
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        gameContext.setName(dane);
        System.out.println("Get Name State: "+ gameContext.getName());
        return !dane.equals("");
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return  Collections.singletonMap(Pattern.compile(".*"),new GetNumberVictory(gameContext));
    }
}