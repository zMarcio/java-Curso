import java.util.Scanner;

public class LerHrFinaleIncial1046 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Diga a entrada");
        int a = x.nextInt();
        System.out.println("Diga a saída");
        int b = x.nextInt();
        if (a>b){
            System.out.println("O JOGO DUROU " + (24-a+b)+" HORA(S)");
        }if (a == b){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }if (a<b){
            System.out.println("O JOGO DUROU " + (b-a) + " HORA(S)");
        }
    }
}
