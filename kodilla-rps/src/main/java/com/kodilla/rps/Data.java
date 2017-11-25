package com.kodilla.rps;

import java.util.List;

public interface Data {
    default GameResult compere(GameAttribute generetedAtribute) {
        if (getIsStrongerThan().contains(generetedAtribute)){
            return GameResult.fail;
        }
        if(getIsWeekerThan().contains(generetedAtribute)){
            return GameResult.win;
        }
        return GameResult.draw;
    }


    String getName();


    List<GameAttribute> getIsStrongerThan();

    List<GameAttribute> getIsWeekerThan();



}
