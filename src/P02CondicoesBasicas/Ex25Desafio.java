package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex25Desafio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Valor do segmento de reta A: ");
        int segmentoA = leia.nextInt();

        System.out.println("Valor do segmento de reta B: ");
        int segmentoB = leia.nextInt();

        System.out.println("Valor do segmento de reta C: ");
        int segmentoC = leia.nextInt();

        if (segmentoA + segmentoB >= segmentoC && segmentoA + segmentoC >= segmentoB && segmentoB + segmentoC >= segmentoA) {
            System.out.println("É possivel formar um triângulo.");
        } else {
            System.out.println("Não da para formar um triângulo");
        }

    }
}