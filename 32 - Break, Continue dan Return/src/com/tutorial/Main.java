package com.tutorial;

public class Main {

    public static void main (String[] args) {

        // break, continue, return

        int a = 0;
        while (true) {
            a++;
            if (a == 10) {
                break;
                // memaksa keluar dari looping
            } else if (a == 5) {
                continue;
                // memaksa memulai aksi dari awal, atau melompati aksi sesuai kondisi
            } else if (a == 7) {
                return;
                // memaksa keluar dari program utama, atau main program,
                // dan mengakhiri program
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping");
    }

}
