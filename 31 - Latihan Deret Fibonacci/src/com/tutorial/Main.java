package com.tutorial;
import java.util.*;

public class Main {

    public static void main (String[] args) {

        // menghitung nilai deret fibonacci ke-n
        int fn, fn1, fn2, n;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;

        // looping dengan for

//        for (int i = 1; i <= n; i++) {
//            System.out.println("nilai ke - " + i + " adalah " + fn);
//            fn = fn1 + fn2;
//            fn2 = fn1;
//            fn1 = fn;
//        }

        // looping dengan while
//        int i = 1;
//        while ( i <= n) {
//            System.out.println("nilai ke - " + i + " adalah " + fn);
//            i++;
//            fn = fn1 + fn2;
//            fn2 = fn1;
//            fn1 = fn;
//        }

        // looping dengan do while
        int i = 1;
        do {
            System.out.println("nilai ke - " + i + " adalah " + fn);
            i++;
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        } while ( i <= n );

    }

}
