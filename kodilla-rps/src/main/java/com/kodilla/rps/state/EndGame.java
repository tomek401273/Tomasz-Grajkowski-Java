package com.kodilla.rps.state;

import com.kodilla.rps.User;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class EndGame implements State {
    @Override
    public void writeMessage() {
        System.out.println("If you really exit please confirm write y");
        System.out.println("If you don't exit please write n");
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
        patternStateMap.put(Pattern.compile("y"), null);
        patternStateMap.put(Pattern.compile("n"),new Summary());
        return patternStateMap;
    }
}
