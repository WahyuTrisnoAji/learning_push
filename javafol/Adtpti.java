package javafol;

import java.util.Scanner;

public class Adtpti {
    public static void main(String[] args) {

        data dt = new data();
        Scanner dt1 = new Scanner(System.in);

        System.out.println("Nama : ");
        dt.nama = dt1.nextLine();
        System.out.println("Tempat lahir : ");
        dt.tempat = dt1.nextLine();
        System.out.println("Tanggal lahir : ");
        dt.tanggal = dt1.nextLine();
        System.out.println("Jenis kelamin : ");
        dt.kelamin = dt1.nextLine();
        System.out.println("Alamat : ");
        dt.alamat = dt1.nextLine();
        System.out.println("Agama : ");
        dt.agama = dt1.nextLine();
        System.out.println("Status : ");
        dt.status = dt1.nextLine();
        System.out.println("Pekerjaan : ");
        dt.pekerjaan = dt1.nextLine();
        System.out.println("Kewarganegaraan : ");
        dt.kewarganegaraan = dt1.nextLine();

        System.out.println();
        System.out.println(dt.nama + "\t" + dt.tempat + "\t" + dt.tanggal + "\t" + dt.kelamin + "\t" + dt.alamat + "\t"
                + dt.agama + "\t" + dt.status + "\t" + dt.pekerjaan + "\t" + dt.kewarganegaraan);
    }
}
