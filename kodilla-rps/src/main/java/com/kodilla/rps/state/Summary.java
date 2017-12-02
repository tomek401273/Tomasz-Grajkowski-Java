package com.kodilla.rps.state;

import com.kodilla.rps.User;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Summary implements State {
    @Override
    public void writeMessage() {
        System.out.println("This session game is end");
        System.out.println("if you play again please write n");
        System.out.println("if you exit please write x");

    }

    @Override
    public User validadeUserChoice(User user, String dane) {
        User userTemp = user;
        userTemp.setCorrectData(true);
        return userTemp;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        Map<Pattern, State> patternStateMap = new HashMap<>();
        patternStateMap.put(Pattern.compile("n"),new NewGame());
        patternStateMap.put(Pattern.compile("x"),new EndGame());
        return patternStateMap;
    }
}
