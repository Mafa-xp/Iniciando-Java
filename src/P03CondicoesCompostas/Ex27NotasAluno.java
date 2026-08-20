package P03CondicoesCompostas;

import java.util.Scanner;

public class Ex27NotasAluno {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Nota A: ");

        double notal = leia.nextDouble();

        System.out.println("Nota B: "); double notaB = leia.nextDouble();

        double mediaNota = (notal + notaB) / 2;

        if (mediaNota >= 7.0){

            System.out.println("APROVADO");
        }else if (mediaNota <= 4.9){ // se não

            System.out.println("REPROVADO");

        }else{
            System.out.println("RECUPERAÇÃO");
        }
    }
}
