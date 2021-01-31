package com.tutorial;

public class Main {

    public static void main (String[] args) {
        // looping bersarang

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            } for (int k = 5; k >= i; k--) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if ((i==j) || ((i+j) == 8)) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+(i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+(i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+(i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
