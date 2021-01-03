package com.tutorial;

public class Main {

    public static void main (String[] args) {

        // void adalah hampa atau tanpa return

        System.out.println(simple());

        fungsiVoid("apa pun");
        selamatPagi("Kevin");
        selamatPagi("Semuanya!");

    }

    private static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama);
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return
    private static float simple() {
        return 10.0f;
    }


}
