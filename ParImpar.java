import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Diga seu número");
        int num = x.nextInt();
        x.close();
        if (num%2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("ÍMPAR");
        }
    }
}
