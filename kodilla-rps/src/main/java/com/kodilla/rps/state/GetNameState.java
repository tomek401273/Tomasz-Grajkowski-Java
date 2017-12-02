package com.kodilla.rps.state;

import com.kodilla.rps.User;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNameState implements State {

    @Override
    public void writeMessage() {
        System.out.println("Write your name");
    }

    @Override
    public User validadeUserChoice(User user, String dane) {
        User userTemp = user;
        userTemp.setCorrectData(!dane.equals(""));
        userTemp.setName(dane);
        System.out.println("Get Name State: "+userTemp.getName());
        return userTemp;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return  Collections.singletonMap(Pattern.compile(".*"),new GetNumberVictory());
    }
}