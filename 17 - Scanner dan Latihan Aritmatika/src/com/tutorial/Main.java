package com.tutorial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;

        // Membuat perhitungan luas persegi panjang
        // luas = panjang * lebar
        System.out.println("menghitung luas");
        System.out.print("panjang \t = ");
        panjang = userInput.nextInt();
        System.out.print("lebar \t\t = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("luas \t\t = " + luas);

        System.out.println("menghitung volume");
        System.out.print("tinggi \t\t = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume \t\t = " + volume);

    }
}
