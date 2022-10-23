import java.util.Scanner;

public class Fatorial1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        for (int i = 1; i<=n;i++){
            b = b * i;
        }
        System.out.println(b);
    }
}
