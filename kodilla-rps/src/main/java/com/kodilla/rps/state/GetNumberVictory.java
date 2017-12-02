package com.kodilla.rps.state;

import com.kodilla.rps.User;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class GetNumberVictory implements State {

    Pattern numbernPattern = Pattern.compile("\\d+");

    @Override
    public void writeMessage() {
        System.out.println("How many rounds will be victory?");
    }

    @Override
    public User validadeUserChoice(User user, String dane) {
        User userTemp = user;
        if(numbernPattern.matcher(dane).matches()){
            userTemp.setCorrectData(true);
            userTemp.setVictory(Integer.parseInt(dane));

            System.out.println("Get Numbers Vicory: "+userTemp.getName()+"  Vicory will be after: "+userTemp.getVictory());
            return userTemp;
        }
        userTemp.setCorrectData(false);
        return userTemp;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        return Collections.singletonMap(numbernPattern,new GetUserAttribute());

    }
}
