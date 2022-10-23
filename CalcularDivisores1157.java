import java.util.Scanner;

public class CalcularDivisores1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = 0;
        for (int i = 0; i<x; i++){
            d = d + 1 ;
            if (x%d==0){
                System.out.println(d);
            }
        }
    }
}
