package javafol;

import java.util.InputMismatchException;
import java.io.*;

public class Datastructure {

    public static void main(String[] args) {
        char favChar;
        int temp;
        String data = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("file2.txt");
        } catch (IOException exc) {
            // Reaksi atas kejadian
            System.out.println("file tidak adaa");
        }
        try {
            do {
                temp = fis.read();
                favChar = (char) temp;
                if (temp != -1)
                    data = data + favChar;
            } while (temp != -1);
            fis.close();
        } catch (IOException exc) {
            // Reaksi atas kejadian
            System.out.println("problem di file");
        }
        System.out.println(data);
        try {
            fos = new FileOutputStream("file2.txt");
        } catch (IOException exc) {
            // Reaksi atas kejadian
            System.out.println("file tidak adaa");
        }

        try {
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));
            }
            do {
                temp = br.read();
                favChar = (char) temp;
                fos.write(favChar);
            } while (temp != 13);
            fos.close();
        } catch (IOException exc) {
            // Reaksi atas kejadian
            System.out.println("file tidak adaa");
        }

        System.out.print("END");
    }

}
