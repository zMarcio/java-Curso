import java.util.Locale;
import java.util.Scanner;

public class Quadrante1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga seu coordenada x: ");
        double x = sc.nextDouble();
        System.out.println("Diga a coordenada y: ");
        double y = sc.nextDouble();
        if (x>0 && y>0){
            System.out.println("Q1");
        }
        if (x<0 && y>0){
            System.out.println("Q2");
        }
        if (x<0 && y<0){
            System.out.println("Q3");
        }
        if (x>0 && y<0){
            System.out.println("Q4");
        }
        if (x==0 && y==0){
                System.out.println("Origem");
        }
    }
}
