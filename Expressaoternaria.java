import java.util.Scanner;

public class Expressaoternaria {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco<20.0)? preco*0.1:preco*0.05;
        System.out.println("O desconto " + desconto);
        System.out.println("Preço a se pagar " + (preco-desconto));
    }
}
