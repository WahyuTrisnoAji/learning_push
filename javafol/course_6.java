package javafol;

import java.util.Scanner;

public class course_6 {
    public static void main(String[] args) {

        // math function
        // MENGHITUNG SISI MIRING

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" masukkan x");
        x = scanner.nextDouble();
        System.out.println("masukkan y");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("Sisi miringnya adalah : " + z);

        scanner.close();
    }
}
