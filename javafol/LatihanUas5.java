package javafol;

public class LatihanUas5 {
    public static void main(String[] args) {

        int[] numbers = { 2, 5, 6, 5, 9, 2, 1, 4, 3, 5, 8 };
        int elemenDicari = 5;
        boolean lima = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elemenDicari) {
                lima = true;
                break;
            }
        }

        if (lima) {
            System.out.println(elemenDicari + " ditemukan !");
        } else {
            System.out.println(elemenDicari + " tidak ditemukan");
        }

    }
}
