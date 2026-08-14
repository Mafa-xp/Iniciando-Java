package P01Iniciante;

import java.util.Scanner;

public class Ex03SalarioFuncionario {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = leia.nextLine();

        System.out.println("Qual seu salário?");
        double salario = leia.nextDouble();

        System.out.println("O funcionário " + nome + "tem um salario de R$"+ salario + " em Julho.");

    }
}
