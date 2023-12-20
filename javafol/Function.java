package javafol;

import java.util.Scanner;

public class Function {

    // kalo fungsi ini tipe datanya langsung dideklarasiin beda sama procedure tadi
    static double avarage(int count) {
        Scanner ratarata = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Masukkan bilangan ke " + (i + 1) + ": ");
            sum += ratarata.nextInt();
        }
        ratarata.close();

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner ratarata = new Scanner(System.in);

        System.out.println("Masukkan jumlah bilangan: ");
        int count = ratarata.nextInt();

        double rata = avarage(count);

        System.out.println("Nilai rata-rata: " + rata);

        ratarata.close();
    }

}
