package P01Iniciante;

import java.util.Scanner;

public class Ex14LocadouraCarro {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos KM o carro percorreu?");
        double kmCarro = leia.nextDouble();

        System.out.println("Quantos dias usou o carro?");
        int diasCarro = leia.nextInt();

        double aluguelCarro = (90 * diasCarro) + (0.2 * kmCarro);

        System.out.println("O aluguel total do carro ficou "+aluguelCarro);

    }
}
