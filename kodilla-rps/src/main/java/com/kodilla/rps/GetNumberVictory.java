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
    public User validadeUserChoice(User user, String dane) {
        User userTemp = user;
        if(numbernPattern.matcher(dane).matches()){
            userTemp.setCorrectName(true);
            userTemp.setVictory(Integer.parseInt(dane));


            System.out.println("Get Numbers Vicory:   "+userTemp.getName()+"  Vicory will be after: "+userTemp.getVictory());
            return userTemp;
        }
        userTemp.setCorrectName(false);
        return userTemp;
    }

    @Override
    public User userGame(User user, String dane) {
        User userTemp = new User();

        //user.setVictory(Integer.parseInt(dane));

        System.out.print(" vicory will be after: "+user.getVictory());
        return null;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
//        Collections.singletonMap(numbernPattern,)
        return null;
    }
}
