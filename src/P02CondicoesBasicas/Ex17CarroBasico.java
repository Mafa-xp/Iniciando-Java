package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex17CarroBasico {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a velocidade do carro?");

        double velocidadeCarro = leia.nextDouble();

        boolean verificando = velocidadeCarro > 80;

        if(verificando) {

            double kmAcima = velocidadeCarro-80;

            double valorMulta = 5 * kmAcima;
            System.out.println("Ops, você foi multado. Pague R$"+ valorMulta +"Dirija com mais atenção!!");

        }else{
            System.out.println("Continue dirigindo com atenção!!");

        }

    }

}

