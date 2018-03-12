package com.kashinkou;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Wal", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(5, 11);

        calcFeetAndInchesToCentimeters(73);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid input");
            return -1;
        }
        double cm = (inches + feet * 12) * 2.54;
        System.out.println(feet + " feets, " + inches + " inches = " + cm + " cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = inches / 12;
        inches %= 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
