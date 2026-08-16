package P01Iniciante;

import java.util.Scanner;

public class Ex12PreçoProduto {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        double valor = leia.nextDouble();

        double valorPromocao = valor - (valor * 0.05);

        System.out.println("Parabéns!! seu produto esta com desconto, de "+valor+" para "+valorPromocao);
    }
}
