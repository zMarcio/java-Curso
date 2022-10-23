import java.util.Scanner;

public class Quadrante1115 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.printf("Diga coordenada x e y em sequencia");
        int x = a.nextInt();
        int y = a.nextInt();
        while (x>0 && y>0){
            System.out.printf("Primeiro");
        }
        while (x<0 && y>0){
            System.out.printf("Segundo");
        }
        while (x<0 && y<0){
            System.out.printf("Terceiro");
        }
        while (x>0 && y<0){
            System.out.printf("Quarto");
        }
    }
}
