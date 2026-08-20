package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex22AnodeNascimento {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nomeRapaz = leia.nextLine();

        System.out.println("Em que ano você nasceu?");
        int anoNascimento = leia.nextInt();
        double idade = 2026 - anoNascimento;

        if (idade >= 18) {
            double quantosMaisVelho = idade - 18;

            if (quantosMaisVelho == 1) {
                System.out.println(nomeRapaz + ", já se passaram " + (int) quantosMaisVelho + " ano des que você fez o alistamento.");
            } else {
                System.out.println(nomeRapaz + ", já se passaram " + (int) quantosMaisVelho + " anos des que você fez o alistamento.");
            }

        } else {

            double quantosMaisNovo = 18 - idade;

            if (quantosMaisNovo == 1) {

                System.out.println(nomeRapaz + ", faltam " + (int) quantosMaisNovo + " ano para o alistamento");
            } else {
                System.out.println(nomeRapaz + ", faltam " + (int) quantosMaisNovo + " anos para o alistamento");
            }
        }
    }
}