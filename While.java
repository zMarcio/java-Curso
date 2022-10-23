import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("DIGA: ");
        int p = x.nextInt();

        while(p != 0){
            p = x.nextInt();
        }
        System.out.println("Chegou a zero parabéns");
    }
}
