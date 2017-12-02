package com.kodilla.rps.state;

import com.kodilla.rps.GameContext;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class EndGame implements State {
    GameContext gameContext;

    public EndGame(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    @Override
    public void writeMessage() {
        System.out.println("If you really exit please confirm write y");
        System.out.println("If you don't exit please write n");
    }

    @Override
    public boolean validadeUserChoice(String dane) {
        if (dane.equals("y") || dane.equals("n")){
            return true;
        }
        return false;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        Map<Pattern, State> patternStateMap = new HashMap<>();
        patternStateMap.put(Pattern.compile("y"), null);
        patternStateMap.put(Pattern.compile("n"),new Summary(gameContext));
        return patternStateMap;
    }
}
