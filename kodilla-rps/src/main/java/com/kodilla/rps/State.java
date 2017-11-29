package com.kodilla.rps;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public interface State {
    Scanner sc = new Scanner(System.in);
    void writeMessage();
    boolean validadeUserChoice(String dane);

    //MaszynaStanowa

    default State process (State prevousState){
        writeMessage();
        String dane = sc.next();
        if (!validadeUserChoice(dane)){
            return prevousState;
        }
        return getsOptionsMap().entrySet().stream()
                .filter(x -> x.getKey().matcher(dane).matches())
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    Map<Pattern, State> getsOptionsMap();

}
