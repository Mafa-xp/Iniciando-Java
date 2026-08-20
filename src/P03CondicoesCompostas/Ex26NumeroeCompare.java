package P03CondicoesCompostas;

import java.util.Scanner;

public class Ex26NumeroeCompare {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Fale um numero");

        int numeroA = leia.nextInt();

        System.out.println("Fale outro numero");

        int numeroB = leia.nextInt();

        if (numeroA > numeroB) {
            System.out.println("O primeiro valor é o maior");
        }
        if (numeroB > numeroA) {
            System.out.println("O segundo valor é o maior");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais");
        }

    }
}
