package com.pragya;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score was : " + highScore);
        //calculateScore(true, 800, 5, 100);

        //calculateScore(true, 10000, 8, 200);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score was : " + highScore);
    }

    /*public static void calculateScore(boolean gameOver ,int score, int levelCompleted, int bonus ){

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Final score was : " + finalScore);
        }*/

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
}

