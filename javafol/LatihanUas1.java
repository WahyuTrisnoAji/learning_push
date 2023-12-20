package javafol;

public class LatihanUas1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 1, 5 };
        int indeksGanti = 1;
        int indeksNew = 10;

        numbers[indeksGanti] = indeksNew;

        System.out.println("Array setelah diganti:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
