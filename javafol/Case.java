package javafol;

import java.util.Scanner;

public class Case {

    public static void main(String[] args) {

        Scanner masukkan = new Scanner(System.in);
        int pilihan;

        // ini inputan pilihannya
        System.out.println("Pilihan kelas di Win Course Solution : ");
        System.out.println("1). Web Development ");
        System.out.println("2). Cyber Security ");
        System.out.println("3). Network Specialist ");
        System.out.println("4). UI&UX ");

        System.out.println("Silahkan pilih class yang ingin anda beli: ");
        pilihan = masukkan.nextInt();

        // ini kondisinya dalam bentuk case(tanpa perulangan)
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih class Web Development");
                break;
            case 2:
                System.out.println("Anda memilih class Cyber Security");
                break;
            case 3:
                System.out.println("Anda memilih class Network Specialist");
                break;
            case 4:
                System.out.println("Anda memilih class UI&UX");
                break;
            default:
                System.out.println("Maaf, mohon masukkan kode course yang benar!");
                break;
        }

        masukkan.close();

    }
}
