package javafol;

public class Arraypti_1 {

    // ini array 1 dimensi
    public static void main(String[] args) {
        String[] nama = { "\n10", "\n20", "\n30", "\n40", "\n50", "\n60", "\n70", "\n80", "\n90", "\n100" };

        System.out.println("Array kelipatan 10: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " ");
        }

        System.out.println("\nPanjang array = " + nama.length);
    }
}
