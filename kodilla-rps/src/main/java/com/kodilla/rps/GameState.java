package com.kodilla.rps;

public class GameState {
    private int userWin = 0;

    public int  game(int chossenNumber,int generetedNumber){

        if (chossenNumber == 1) {
            Rock rock = new Rock();
            System.out.println("you chose:" + rock.getName());
            userWin = rock.compere(generetedNumber);

        } else if (chossenNumber == 2) {
            Scissors scissors = new Scissors();
            System.out.println("you chose:" + scissors.getName());
            userWin = scissors.compere(generetedNumber);
        } else if (chossenNumber == 3) {
            Paper paper = new Paper();
            System.out.println("you chose:" + paper.getName());
            userWin = paper.compere(generetedNumber);
        }
        if(userWin==1){
            System.out.println("You lose");
        }
        else if(userWin==2){
            System.out.println("Remis");
        }
        else if(userWin ==3){
            System.out.println("You win");
        }
        return userWin;
    }

}
