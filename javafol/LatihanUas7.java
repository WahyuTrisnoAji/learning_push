package javafol;

public class LatihanUas7 {
    public static void main(String[] args) {
        int[] numbers = { 8, 15, 3, 10, 7 };
        int elemenDicari = 9;
        boolean ditemukan = false;
        int i = 0;

        // Menambahkan perulangan do-while untuk mencari semua kemungkinan kemunculan
        // elemenDicari
        do {
            if (numbers[i] == elemenDicari) {
                ditemukan = true;
                System.out.println(elemenDicari + " ditemukan pada indeks " + i);
            }
            i++;
        } while (i < numbers.length);

        if (!ditemukan) {
            System.out.println(elemenDicari + " tidak ditemukan dalam array.");
        }
    }
}
