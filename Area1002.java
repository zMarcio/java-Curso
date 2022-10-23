import java.util.Scanner;

public class Area1002 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Diga seu raio : ");
        double raio = x.nextDouble();
        double FormulaArea = pi * (raio*raio);
        System.out.println("Área = " + FormulaArea);
    }
}
