import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int p = x.nextInt();
        String dia;

        switch (p){
            case 1 :
                dia = "Domingo";
                break;
            case 2 :
                dia = "Segunda-Feira";
                break;
            case 3 :
                dia = "Terça-Feira";
                break;
            case 4 :
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor Inválido";
                break;
        }
        System.out.println("Dia = " + dia);
    }
}
