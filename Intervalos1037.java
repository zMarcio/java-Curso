import java.util.Locale;
import java.util.Scanner;

public class Intervalos1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Diga seu numero");
        double numero = sc.nextDouble();
        if (numero > 0.0 && numero <= 25.0){
            System.out.println("Intervalor [0,25]");
        }
        if (numero > 25.0 && numero <= 50.0){
            System.out.println("Intervalor [25,50]");
        }
        if (numero > 50.0 && numero <= 75.0){
            System.out.println("Intervalor [50,75]");
        }
        if (numero > 75.0 && numero <= 100.0){
            System.out.println("Intervalor [75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}
