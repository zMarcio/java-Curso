import java.util.Locale;
import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X:");
        double x = sc.nextDouble();
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        double y = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();


        double p= (x+x1+x2)/2;
        double areaX = Math.sqrt(p*(p-x)*(p-x1)*(p-x2));
        double p1 = (y+y1+y2)/2;
        double areaY = Math.sqrt((p1*(p1-y)*(p1-y1)*(p1-y2)));
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX>areaY) System.out.println("Larger area: X");
        else System.out.println("Larger area: Y");
    }
}
