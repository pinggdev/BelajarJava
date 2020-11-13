package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        float a,b,hasil;
        String operator;
        Scanner inputUser;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("operator = ");
        operator = inputUser.next();

        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator) {
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                //pembagian
                if (b == 0) {
                    System.out.println("pembagian nol menghasilkan tak hingga");
                } else {
                    hasil = a / b;
                    System.out.println("hasil = " + hasil);
                }
                break;
            default:
                System.out.println("operator" + operator + " tidak ditemukan");
        }
    }
}
