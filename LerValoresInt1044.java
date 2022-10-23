import java.util.Scanner;

public class LerValoresInt1044 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("diga seu numero a");
        int a = x.nextInt();
        System.out.println("diga seu numero b");
        int b = x.nextInt();
        if (a%b == 0 || b%a == 0){
            System.out.println("São Multiplos");
        }else {
            System.out.println("Não São Multiplos");
        }
    }
}
