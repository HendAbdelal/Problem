import java.text.DecimalFormat;
import java.util.Scanner;

public class triangle {
    private static boolean checkIfRight(double h, double b, double p) {
        double DELTA = 0.7;
        return ((h * h) - (b * b) + (p * p)) < DELTA;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#####.######");


        System.out.println("Enter coordinate x of dot A");
        Scanner s = new Scanner(System.in);
        int X1 = s.nextInt();
        System.out.println("Enter coordinate y of dot A");
        int Y1 = s.nextInt();
        System.out.println("Enter coordinate x of dot B");
        int X2 = s.nextInt();
        System.out.println("Enter coordinate y of dot B");
        int Y2 = s.nextInt();
        System.out.println("Enter coordinate x of dot C");
        int X3 = s.nextInt();
        System.out.println("Enter coordinate y of dot C");
        int Y3 = s.nextInt();
        s.close();
        double AB = Math.sqrt(
                ((Math.pow((X2 - X1), 2) +
                        (Math.pow((Y2 - Y1), 2)))));
        double BC = Math.sqrt(
                ((Math.pow((X3 - X2), 2) +
                        (Math.pow((Y3 - Y2), 2)))));
        double AC = Math.sqrt(
                ((Math.pow((X1 - X3), 2) +
                        (Math.pow((Y1 - Y3), 2)))));

        System.out.println("Length of AB is " + df.format(AB));
        System.out.println("Length of BC is " + df.format(BC));
        System.out.println("Length of AC is " + df.format(AC));

        if (AB == BC && BC == AC) {
            System.out.println("Triangle IS 'Equilateral'");
        } else {
            System.out.println("Triangle IS NOT 'Equilateral'");
        }

        if (AB == BC || BC == AC || AC == AB) {
            System.out.println("Triangle IS 'Isosceles'");
        } else {
            System.out.println("Triangle IS NOT 'Isosceles'");
        }

        if (checkIfRight(AB, BC, AC) || checkIfRight(BC, AB, AC) || checkIfRight(AC, AB, BC)) {
            System.out.println("Triangle IS 'Right'");
        } else {
            System.out.println("Triangle IS NOT 'Right'");
        }

        Double PERIMETER = AB + BC + AC;
        System.out.println("Perimeter : '" + PERIMETER + "'");

        for (int i = 0; i <= PERIMETER; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}




