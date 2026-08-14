package P01Iniciante;

import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = leia.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}