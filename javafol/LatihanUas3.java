package javafol;

public class LatihanUas3 {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 6, 7, 3, 5, 2, 3 };
        int batas = 3;
        int newIndeks = 10;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < batas) {
                numbers[i] = newIndeks;
            }
        System.out.println("Array setelah diganti: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
