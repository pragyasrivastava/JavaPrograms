package com.pragya;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but greater than 1000 ");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got Here");
        }*/


        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score was : " + finalScore);
        }

       /* boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (secondGameOver) {
            int FinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("New Final Score was : " + FinalScore);
        } */  //correct but disadvantage is using lot of space

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score was : " + finalScore);
        } // disadvantage is we don't have permanent record of the variables,duplicating the code so if change is required we nedd to change it at more than 1 place
    }

}
