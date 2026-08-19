package P01Iniciante;

import java.util.Scanner;

public class Ex16Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = teclado.nextInt();

        System.out.print("Quantos anos já fumou: ");
        int anosFumando = teclado.nextInt();

        // 1 ano = 365 dias
        int totalDiasFumando = anosFumando * 365;

        // Total de cigarros fumados na vida inteira
        int totalCigarros = cigarrosPorDia * totalDiasFumando;

        // Cada cigarro tira 10 minutos de vida
        int totalMinutosPerdidos = totalCigarros * 10;

        // Convertendo minutos para dias (1 dia tem 1440 minutos -> 24h * 60min)
        double diasPerdidos = (double) totalMinutosPerdidos / 1440;

        // Exibe o resultado formatado com 1 casa decimal
        System.out.printf("\nVocê perderá aproximadamente %.1f dias de vida.%n", diasPerdidos);

        teclado.close();
    }
}

