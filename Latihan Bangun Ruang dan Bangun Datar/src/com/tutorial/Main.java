package com.tutorial;

public class Main {
    public static void main(String[] args) {
       
        //segitiga
        int a = 12;
        int t1 = 6;
        double c = 0.5;
        double luassegitiga = a * t1 * c ;

        System.out.println( "Luas Segitiga : " + luassegitiga + " CM^2" );

        //tabung
        int t2 = 10;
        double r = Math.pow(6, 2);
        double phi = 3.14;
        double volumetabung = phi * r * t2;

        System.out.println( "Volume Tabung : " + volumetabung + " CM^3" );

        //lingkaran
        double j = Math.pow(5, 2);
        double p = 3.14;
        double luaslingkaran = p * j ;

        System.out.println( "Luas Lingkaran : " + luaslingkaran + " CM^2" );

        System.out.println( "Jumlah Semua Bangun Ruang = " + luassegitiga + volumetabung + luaslingkaran );

    }  
}
