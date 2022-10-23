import java.util.Locale;
import java.util.Scanner;

public class CalculatorFinal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter radius: ");

        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + String.format("%.2f",c));
        System.out.println("Volume: " + String.format("%.2f",v));
        System.out.println("PI value: " + String.format("%.2f",Calculator.PI));
    }
}
