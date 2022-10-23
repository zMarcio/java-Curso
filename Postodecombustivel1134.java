import java.util.Scanner;

public class Postodecombustivel1134 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        int Num = x.nextInt();

        while (Num != 4){
            if (Num == 1){
                Alcool = Alcool + 1;
            }
            if (Num == 2){
                Gasolina = Gasolina + 1;
            }
            if (Num == 3){
                Diesel = Diesel + 1;
            }
            Num = x.nextInt(); //ISSO AQUI QUE FAZ O WHILE RODA PARA CHEGAR NA MSG DE FORA
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);

    }
}
