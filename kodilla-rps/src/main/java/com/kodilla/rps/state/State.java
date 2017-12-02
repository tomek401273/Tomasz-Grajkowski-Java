package com.kodilla.rps.state;

import com.kodilla.rps.User;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public interface State {
    Scanner sc = new Scanner(System.in);
    void writeMessage();
    User validadeUserChoice(User user, String dane);
    User user1 = new User();

    //MaszynaStanowa

    default State process (State prevousState){

        writeMessage();

        String dane = sc.next();


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

    Map<Pattern, State> getsOptionsMap();

}