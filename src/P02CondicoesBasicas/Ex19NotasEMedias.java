package P02CondicoesBasicas;
import java.util.Scanner;
public class Ex19NotasEMedias {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nomeAluna = leia.nextLine();

        System.out.println("Qual sua primeira nota?");
        double notaA = leia.nextDouble();

        System.out.println("Qual sua segunda nota?");
        double notab = leia.nextDouble();

        double media = (notaA + notab) / 2;
        boolean verificacao = media >= 7.0;

        if (verificacao) {

            System.out.println("PARABÉNS! " + nomeAluna+"sua média foi: " + media + ", você teve um bom aproveitamento.");
        } else {
            System.out.println("Que pena.." + nomeAluna + " sua média foi: " + media + " tente aproveitar mais esta oportunidade.");
        }

    }
}