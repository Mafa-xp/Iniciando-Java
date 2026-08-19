package P01Iniciante;

import java.util.Scanner;

public class Ex15SalarioMes {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos dias você trabalhou nesse mês?");
        int diasMes = leia.nextInt();

        double diaParaHoras = diasMes * 8;
        double salarioFuncionario = diaParaHoras * 25;

        System.out.println("Você ira receber R$"+salarioFuncionario);
    }
}
