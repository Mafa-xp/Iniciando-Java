package P01Iniciante;

import java.util.Scanner;

public class Ex05notasEMedia {
    static void main() {
        Scanner leia = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        double notaA = leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double notaB = leia.nextDouble();

        double media = (notaA + notaB)/2;

        System.out.println("A media entre "+notaA+" e "+notaB+" é "+media);
    }
}
