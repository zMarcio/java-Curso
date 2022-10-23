import java.util.Scanner;

public class Valores1007 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite A = ");
        int a = x.nextInt();
        System.out.println("Digite B = ");
        int b = x.nextInt();
        System.out.println("Digite C = ");
        int c = x.nextInt();
        System.out.println("Digite D = ");
        int d = x.nextInt();
        System.out.println("Diferença = " + ((a*b)-(c*d)));
    }
}
