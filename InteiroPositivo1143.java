import java.util.Scanner;

public class InteiroPositivo1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i<=x;i++){
            int primeiro = i;
            int segundo = i*i;
            int terceiro = i*i*i;
            System.out.println(primeiro+" "+ segundo +" "+ terceiro);
        }
    }
}
