import java.util.Scanner;

public class Senhainvalida1114 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.printf("Diga sua senha: ");
        int senha = x.nextInt();
        while (senha != 2002){
            System.out.printf("Senha inválida, repita sua senha: ");
            senha = x.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
