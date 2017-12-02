package com.kodilla.rps.state;

import com.kodilla.rps.GameAttribute;
import com.kodilla.rps.GenerateAtribute;
import com.kodilla.rps.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

public class GenerateComuterAtribute  implements State {
    User user1 = new User();
    @Override
    public void writeMessage() {
        System.out.println("The process of selecting a computer attribute in progress ....");
    }

    @Override
    public User validadeUserChoice(User user, String dane) {
        User userTemp = new User();

        GenerateAtribute generateAtribute = new GenerateAtribute();
        GameAttribute computerAtteibute = generateAtribute.generete();
        userTemp.setComputerAtribute(computerAtteibute);
        System.out.println("You just select: "+userTemp.getUserAtribute());
        System.out.println("Computer just select"+userTemp.getComputerAtribute());
        return userTemp;
    }

    @Override
    public Map<Pattern, State> getsOptionsMap() {
        Map<Pattern,State> patternStateMap = new HashMap<>();
        patternStateMap.put(Pattern.compile("Rock"),new GenerateComuterAtribute());
        patternStateMap.put(Pattern.compile("Scissors"),new GenerateComuterAtribute());
        patternStateMap.put(Pattern.compile("Paper"),new GenerateComuterAtribute());
        return patternStateMap;
    }
    @Override
    public State process(State prevousState){
        writeMessage();

        String dane = "Rock";


        if (!validadeUserChoice(user1,dane).isCorrectData()){
            return prevousState;
        }


        String finalDane = dane;
        return getsOptionsMap().entrySet().stream()
                .filter(x -> x.getKey().matcher(finalDane).matches())
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
