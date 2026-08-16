package P01Iniciante;

import java.util.Scanner;

public class Ex11ValorDelta {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Fale um valor para A: ");
        double valorA = leia.nextDouble();

        System.out.println("Fale um valor para B: ");
        double valorB = leia.nextDouble();

        System.out.println("Fale um valor para C: ");
        double valorC = leia.nextDouble();

        double valorDelta = (valorB * valorB) - (4 * valorA * valorC);

        System.out.println("O valor de delta será "+valorDelta);
    }
}
