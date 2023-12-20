package javafol;

import java.util.Scanner;

public class Sekuensial {
    public static void main(String[] args) {

        java.util.Scanner masukkan = new java.util.Scanner(System.in);

        // ini inputan
        System.out.println("Masukkan nilai panjang ! ");
        int panjang = masukkan.nextInt();
        System.out.println("Masukkan nilai lebar ! ");
        int lebar = masukkan.nextInt();

        System.out.println("Panjang persegi panjang ialah " + panjang);
        System.out.println("Lebar persegi panjang ialah " + lebar);

        // disini proses sekalian output
        System.out.println("Jadi, luas persegi panjang adalah = " + panjang * lebar);
    }

}
