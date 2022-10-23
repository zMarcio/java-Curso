import java.util.Scanner;

public class Item1038 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Diga seu código");
        int a = x.nextInt();
        System.out.println("Diga a quantidade");
        int b = x.nextInt();
        if (a == 1){
            System.out.println("Total: " + (b*4));
        }
        if(a==2){
            System.out.println("Total: " + (b*4.5));
        }
        if (a==3){
            System.out.println("Total: "+(b*5));
        }
        if (a==4){
            System.out.println("Total: "+(b*2));
        }
        if (a==5){
            System.out.println("Total: "+(b*1.5));
        }
    }
}
