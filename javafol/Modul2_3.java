package javafol;

import java.util.Scanner;

public class Modul2_3 {

    public static void main(String[] args) {
        int a1;
        int a2;
        int ap;

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("a1 = ");
        a1 = s.nextInt();
        System.out.println("a2 = ");
        a2 = s.nextInt();
        ap = a1 + a2;
        System.out.println("a1 =" + a1 + " , a2 = " + a2);
        System.out.println("a1 + a2 = " + ap);

    }
}