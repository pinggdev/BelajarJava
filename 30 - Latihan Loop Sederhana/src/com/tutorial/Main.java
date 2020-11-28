package com.tutorial;
import java.util.*;

public class Main {

    public static void main (String[] args) {

//        program untuk menjumlahkan angka dengan rentang

//        program while

//        System.out.println("Program dengan while");

        int nilaiAwal, nilaiAkhir, total;
        Scanner inputuser = new Scanner(System.in);
//        System.out.print("Masukkan nilai awal : ");
//        nilaiAwal = inputuser.nextInt();
//        System.out.print("Masukkan nilai akhir : ");
//        nilaiAkhir = inputuser.nextInt();
//
//        total = 0;
//        while ( nilaiAwal <= nilaiAkhir ) {
//            total += nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//        }
//        System.out.println("Total nya adalah : " + total);


//      program do while

//        System.out.println("Program dengan do while");
//
//        System.out.print("Masukkan nilai awal : ");
//        nilaiAwal = inputuser.nextInt();
//        System.out.print("Masukkan nilai akhir : ");
//        nilaiAkhir = inputuser.nextInt();
//
//        total = 0;
//        do {
//            total += nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//        } while (nilaiAwal <= nilaiAkhir);
//        System.out.println("Total nya adalah : " + total);



//        program for

        System.out.println("Program dengan for");

        System.out.print("Masukkan nilai awal : ");
        nilaiAwal = inputuser.nextInt();
        System.out.print("Masukkan nuilai akhir : ");
        nilaiAkhir = inputuser.nextInt();

        total = 0;
        for (nilaiAwal = 1; nilaiAwal <= nilaiAkhir; nilaiAwal++) {

            total += nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        }
        System.out.println("Total nya adalah : " + total);

    }

}
