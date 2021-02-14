package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++) {
            System.out.println("index ke-" + (i + 1) + " adalah = " + arrayAngka[i]);
        }

        System.out.println();

        // looping dengan properti dari array
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-" + (i + 1) + " adalah = " + arrayAngka[i]);
        }

        System.out.println();

        // looping khususon untuk collection <- array
        System.out.println("looping dengan for each");
        int no = 1;
        for(int angka : arrayAngka) {
            System.out.println("index ke-" + no + " adalah = " + angka);
            no++;
        }

    }
}
