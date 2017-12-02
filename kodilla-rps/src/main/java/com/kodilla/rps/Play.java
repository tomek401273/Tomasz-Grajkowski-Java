package com.kodilla.rps;

import com.kodilla.rps.state.GetNameState;
import com.kodilla.rps.state.State;

public class Play {
    public void play() {
        GameContext gameContext = new GameContext();
        State state = new GetNameState(gameContext)  ;
        try{
            do {
                state = state.process(state);
            }
            while (!state.equals(null));
        }catch (NullPointerException e){
            System.out.println("Exit Exit");
        }

        System.out.println("YOU are now exit game !!!");
    }
}
