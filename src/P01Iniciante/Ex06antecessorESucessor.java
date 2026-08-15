package P01Iniciante;

import java.util.Scanner;

public class Ex06antecessorESucessor {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leia.nextInt();

        int numeroAntecessor = numero -1;
        int numeroSucessor = numero +1;

        System.out.println("O numero antecessor de "+numero+" é "+numeroAntecessor);
        System.out.println("O número sucessor de "+numero+" é "+numeroSucessor);

    }
}
