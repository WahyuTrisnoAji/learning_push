package javafol;

import java.util.Scanner;

public class LatihanUas13 {
    public static void main(String[] args) {
        Scanner wahyu = new Scanner(System.in);

        System.out.print("masukkan panjang: ");
        double panjang = wahyu.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = wahyu.nextDouble();

        double luas = hitungLuas(panjang, lebar);
        System.out.println("luas persegi panjang: " + luas);

    }

    static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}
