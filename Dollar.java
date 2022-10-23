import java.util.Locale;
import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? " + CurrencyConverter.dollar);
        System.out.println("How many dollars will be bought? " + CurrencyConverter.real);
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.soma);
    }
}
