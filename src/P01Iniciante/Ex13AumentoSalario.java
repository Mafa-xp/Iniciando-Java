package P01Iniciante;

import java.util.Scanner;

public class Ex13AumentoSalario {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu salario?");
        double salario = leia.nextDouble();

        double salarioAumento = salario + (salario * 0.10);
    }
}
