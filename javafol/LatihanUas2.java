package javafol;

public class LatihanUas2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 5, 4, 7, 4 };
        int nilaiLama = 3;
        int nilaiBaru = 15;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == nilaiLama) {
                numbers[i] = nilaiBaru;
            }
        }
        System.out.println("Array setelah diubah: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
    }
}
