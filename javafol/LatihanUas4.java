package javafol;

import java.util.Random;

public class LatihanUas4 {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 1, 7, 6, 7 };
        int nilaiBaru = 15;

        Random wahyu = new Random();
        int acakNilai = wahyu.nextInt(numbers.length);

        numbers[acakNilai] = nilaiBaru;

        System.out.println("Array setelah diubah");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
