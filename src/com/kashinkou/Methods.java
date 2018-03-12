package com.kashinkou;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String player1 = "Jinjiang";
        String player2 = "Weichao";
        String player3 = "Mengmeng";
        String player4 = "Guangbi";
        int score1 = 1500;
        int score2 = 900;
        int score3 = 400;
        int score4 = 50;

        int highScorePosition = calculateHighScorePosition(score1);
        displayHighScorePosition(player1, highScorePosition);

        highScorePosition = calculateHighScorePosition(score2);
        displayHighScorePosition(player2, highScorePosition);

        highScorePosition = calculateHighScorePosition(score3);
        displayHighScorePosition(player3, highScorePosition);

        highScorePosition = calculateHighScorePosition(score4);
        displayHighScorePosition(player4, highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
