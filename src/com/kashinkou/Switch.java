package com.kashinkou;

public class Switch {
    public static void main(String[] args) {
        char charValue = 'C';

        switch (charValue) {
            case 'A':
                System.out.println("found A");
                break;

            case 'B':
                System.out.println("found B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("found " + charValue);
                break;

            default:
                System.out.println("not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
