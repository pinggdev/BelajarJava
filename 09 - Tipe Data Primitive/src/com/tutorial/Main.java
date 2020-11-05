package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // tipe data di java:
        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan / bilangan bulat)
        int i = 10;
        System.out.println("=======INTEGER=======");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai MAX = " + Integer.MAX_VALUE);
        System.out.println("Nilai MIN = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes" );
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");
        System.out.println("");

        // byte (satuan)
        byte b = 10;
        System.out.println("=======BYTE=======");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai MAX = " + Byte.MAX_VALUE);
        System.out.println("Nilai MIN = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes" );
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");
        System.out.println("");

        // short (satuan)
        short s = 10;
        System.out.println("=======SHORT=======");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai MAX = " + Short.MAX_VALUE);
        System.out.println("Nilai MIN = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes" );
        System.out.println("Besar Short = " + Short.SIZE + " bit");
        System.out.println("");

        // long (satuan)
        long l = 10L;
        System.out.println("=======LONG=======");
        System.out.println("Nilai long l = " + l);
        System.out.println("Nilai MAX = " + Long.MAX_VALUE);
        System.out.println("Nilai MIN = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes" );
        System.out.println("Besar Long = " + Long.SIZE + " bit");
        System.out.println("");

        // float (koma, bilangan real)
        float f = 8.5f;
        System.out.println("=======FLOAT=======");
        System.out.println("Nilai float f = " + f);
        System.out.println("Nilai MAX = " + Float.MAX_VALUE);
        System.out.println("Nilai MIN = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes" );
        System.out.println("Besar Float = " + Float.SIZE + " bit");
        System.out.println("");

        // char (karakter) // berdasarkan ASCII
        char c = 'c';
        System.out.println("=======CHAR=======");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai MAX = " + Character.MAX_VALUE);
        System.out.println("Nilai MIN = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes" );
        System.out.println("Besar Char = " + Character.SIZE + " bit");
        System.out.println("");

        // boolean (true/false) // berdasarkan ASCII
        boolean val = true;
        System.out.println("=======BOOLEAN=======");
        System.out.println("Nilai boolean val = " + val);
        System.out.println("Nilai MAX = " + Boolean.TRUE);
        System.out.println("Nilai MIN = " + Boolean.FALSE);
        System.out.println("");

    }
}
