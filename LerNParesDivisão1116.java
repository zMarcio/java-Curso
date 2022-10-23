import java.util.Scanner;

public class LerNParesDivisão1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0;i<x;i++){
            double a = sc.nextInt();
            double b = sc.nextInt();
            if(b==0){
                System.out.println("DIVISÃO IMPOSSIVEL");
            }
            else {
                double div = (double) a/b;
                System.out.println(div);
            }
        }
    }
}
