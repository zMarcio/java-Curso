import java.util.Scanner;

public class Peca1010 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 12;
        int a2 = 16;
        System.out.println("Diga o codigo da peça : " + a +" e " + a2);
        int b = 1;
        int b2 = 2;
        System.out.println("Diga o numero de peças que deseja : " + b +" e " + b2);
        double c = 5.30;
        double c2 = 5.10;
        System.out.println("Valor da peça : " +c +" e " + c2);
        double valor = (b * c) + (b2 * c2);
        System.out.println("Valor a pagar : R$" + valor);
    }
}
