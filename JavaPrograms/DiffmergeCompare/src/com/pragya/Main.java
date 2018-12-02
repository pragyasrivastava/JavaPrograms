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


        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500);{

            position = 2;
        } else if (playerScore >= 500){
            position = 3;
        }
        return position;
    }
}

