package P01Iniciante;

import java.util.Scanner;

public class Ex09DinheiroDolares {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quanto dinheiro você tem na carteira?");
        double dinheiro = leia.nextDouble();

        double dinheiroDolares = dinheiro / 3.45;

        System.out.println("Você tem R$"+dinheiro+" conseguindo converter para US$"+dinheiroDolares);
    }
}
