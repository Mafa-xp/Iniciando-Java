package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex18idadeParaVotar {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");

        int anoNascimento = leia.nextInt();

        double idade = 2026 - anoNascimento;
        boolean verificacaoVotar = idade >= 16;

        if (verificacaoVotar) {
            System.out.println("Oba, você têm "+(int)idade+" anos, ja pode votar esse ano.");
        }else{
            System.out.println("Que pena, você têm "+(int)idade+" anos, não pode votar esse ano.");

        }



    }

}
