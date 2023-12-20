package javafol;

import java.util.Random;
import java.util.Scanner;

public class Suit {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int a = r.nextInt(3);
        int nSuit = 0;
        String suit = s.nextLine();

        switch (suit) {
            case "Batu":
                nSuit = 0;
                break;
            case "Gunting":
                nSuit = 1;
                break;
            case "Kertas":
                nSuit = 2;
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }

        if (a == 0) {
            System.out.println("Komputer memilih batu");
        } else if (a == 1) {
            System.out.println("Komputer memilih gunting");
        } else if (a == 2) {
            System.out.println("Komputer memilih kertas");
        }

        if (nSuit == a) {
            System.out.println("Draw");
        } else {
            if ((nSuit == 0 && a == 2) || (nSuit == 1 && a == 0) || (nSuit == 2 && a == 1)) {
                System.out.println("Kalah");
            } else if ((nSuit == 1 && a == 2) || (nSuit == 2 && a == 0) || (nSuit == 0 && a == 1)) {
                System.out.println("Menang");
            }
        }
    }
}
