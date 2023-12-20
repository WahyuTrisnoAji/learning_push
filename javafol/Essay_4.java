package javafol;

public class Essay_4 {
    public static void main(String[] args) {
        // Example usage:
        int number = 6;
        String result = oddOrEven(number);
        System.out.println(number + " is " + result);
    }

    public static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
