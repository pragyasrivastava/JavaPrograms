package com.pragya;

public class Main {

    public static void main(String[] args) {

       /*String playerName = "John";
        int score=1500;
        calculateHighScorePosition(score);
        displayHighScorePosition(playerName,);*/

       int highScorePosition = calculateHighScorePosition(1500);
       displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jack", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position " + highScorePosition+ " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        /*if (playerScore >= 1000) {
            //int position =1;
            //return position;
            return 1;
        } else if (playerScore >=500 && playerScore<1000) {
            return 2;
        } else if (playerScore >=100 && playerScore<500) {
            return 3;
        } else {
            return 4;
        }

       /* if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >=500) {
            return 2;
        } else if (playerScore >=100) {
            return 3;
        } else {
            return 4;
        }*/ //Alternative way to solve ;playerScore<1000,playerScore<500 is checking the same condition again so removed

        /* if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >=500) {
            return 2;
        } else if (playerScore >=100) {
            return 3;
        }
            return 4; /Alternative way to solve
}*/
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){

            position = 2;
    } else if (playerScore >= 500){
            position = 3;
        }
        return position;
    }
}

