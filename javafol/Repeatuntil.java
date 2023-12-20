package javafol;

import java.util.Scanner;

public class Repeatuntil {

    public static void main(String[] args) {

        Scanner wahyu = new Scanner(System.in);

        int inputan;

        do {
            System.out.println("Masukkan nilai yang lebih besar dari 3 ! ");
            inputan = wahyu.nextInt();

            // program akan tetep jalan kemudian dicek
            if (inputan <= 3) {
                System.out.println("Coba lagi !, masukkan angka bernilai lebih dari 3");
            }

            // ini tuh sama artinya kayak until, yang dimana program akan berakhir sampai
            // syarat di bawah terpenuhi
        } while (inputan <= 3);
        System.out.println("Terima kasih sudah memasukkan nilai yang benar !!!");

        wahyu.close();
    }
}
