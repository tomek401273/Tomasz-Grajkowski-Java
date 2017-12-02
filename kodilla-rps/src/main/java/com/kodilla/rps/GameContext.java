package com.kodilla.rps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameContext {
    private String name;
    private int victory;
    private boolean correctData;
    private GameAttribute userAtribute;
    private GameAttribute computerAtribute;
    private int actualUserScore;
    private int actualComputerScore;
    private boolean totalUserWin;
}
