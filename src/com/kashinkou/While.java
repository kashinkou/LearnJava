package com.kashinkou;

public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

//        for (count=0; count!=5; count++) {
//            System.out.println("Count value is " + count);
//        }

//        count = 1;

//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 5);

        System.out.println();

        int n = 4;
        int endNum = 20;
        int evenCount = 0;

        while (n <= endNum) {
            n++;
            if (!isEvenNumber(n)) {
                continue;
            }
            System.out.println("Even number " + n);
            evenCount++;
            if (evenCount == 5) {
                System.out.println("Total even number found: " + evenCount);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
