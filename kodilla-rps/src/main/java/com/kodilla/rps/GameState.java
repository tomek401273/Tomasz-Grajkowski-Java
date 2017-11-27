package com.kodilla.rps;

public class GameState {


    public GameResult game(GameAttribute chosenAtribute, GameAttribute generetedAttribute){

        Data data =chosenAtribute.getData();
        return data.compere(generetedAttribute);
    }



}
