package javafol;

import java.util.Scanner;

public class course_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Siapa namamu? ");
        String nama = scanner.nextLine();
        System.out.println("Berapa umurmu? ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dimana alamatmu? ");
        String alamat = scanner.nextLine();

        System.out.println("hello " + nama);
        System.out.println("umurmu " + umur + " tahun");
        System.out.println("alamatmu di " + alamat);
    }
}
