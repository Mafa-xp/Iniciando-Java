package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex20ParOuImpar {
    static void main() {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = leia.nextInt();

        if (numero % 2 == 0){ /*Se pegar o numero e dividir por 2 vai restar 0?*/

            System.out.println("0 número " + numero + "é PAR.");

        }else{

            System.out.println("0 número " + numero + "é ÍMPAR.");

        }

    }
}

