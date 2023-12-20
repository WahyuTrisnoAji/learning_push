package javafol;

public class Arraymulti {

    // kalo ini yang multi dimensi (dua dimensi)
    public static void main(String[] args) {
        int[][] kolom = {
                { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 }
        };

        System.out.println("Array data 9 sampai 1: ");
        System.out.println(" ");
        for (int i = 0; i < kolom.length; i++) {
            for (int j = 0; j < kolom[i].length; j++) {
                System.out.println(kolom[i][j] + " ");
            }

            System.out.println();
        }

    }
}