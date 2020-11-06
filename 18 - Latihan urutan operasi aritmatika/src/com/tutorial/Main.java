package com.tutorial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // pembagian atau perkalian akan dilakukan terlebih dahulu

        // jika dilakukan pembagian dan pembagian, maka akan di lakukan
        // operasi nya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //mengelompokkan operasi dengan ( )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        // menghitung persamaan kuadrat
        Scanner inputUser = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("nilai x = ");
        x = inputUser.nextInt();
        System.out.print("gradient m = ");
        m = inputUser.nextInt();
        System.out.print("bias c = ");
        c = inputUser.nextInt();

        int y = (m * x * x) + c;
        System.out.println("nilai y = " + y);
    }
}
