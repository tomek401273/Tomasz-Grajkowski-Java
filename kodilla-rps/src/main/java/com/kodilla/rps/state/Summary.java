package com.kodilla.rps.state;

import com.kodilla.rps.GameContext;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Summary implements State {
    GameContext gameContext;
    public Summary(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    @Override
    public void writeMessage() {
        System.out.println("This session game is end");
        System.out.println("if you play again please write n");
        System.out.println("if you exit please write x");

    }

    @Override
    public boolean validadeUserChoice(String dane) {

        if (dane.equals("n") || dane.equals("x")){
            return true;
        }
        return false;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        Map<Pattern, State> patternStateMap = new HashMap<>();
        patternStateMap.put(Pattern.compile("n"),new NewGame(gameContext));
        patternStateMap.put(Pattern.compile("x"),new EndGame(gameContext));
        return patternStateMap;
    }
}
