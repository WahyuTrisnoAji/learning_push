package javafol;

public class course_2 {

    public static void main(String[] args) {

        String x = "air putih";
        String y = "jus";
        String ketiga;

        ketiga = x;
        x = y;
        y = ketiga;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
