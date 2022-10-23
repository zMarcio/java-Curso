import java.util.Scanner;

public class NumInt {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Diga seu numero inteiro");
        int a = x.nextInt();
        if (a>=0){
            System.out.println("Não negativo");
        }else{
            System.out.println("Negativo");
        }
    }
}
