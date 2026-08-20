package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex23PromocaoMulher {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu nome?");

        String nomeCliente = leia.nextLine();

        System.out.println("Qual seria seu sexo?");
        String sexoCliente = leia.nextLine();

        System.out.println("Qual o valor da compra do cliente?");

        double valorCompraCliente = leia.nextDouble();

        if (sexoCliente.equalsIgnoreCase("mulher") || sexoCliente.equalsIgnoreCase("Feminino")) {

            double valorFemComPromocao = valorCompraCliente - (valorCompraCliente * 0.13);

            System.out.println("PARABENS!! " + nomeCliente + ", feliz dia das mulheres. Você ganhou 13% de desconto! Sua compra era no valor de R$" + valorCompraCliente + " para R$" + valorFemComPromocao);

        } else {
            double valorMasComPromocao = valorCompraCliente - (valorCompraCliente * 0.05);

            System.out.println("PARABENS!! " + nomeCliente + ", você ganhou um desconto de 5%! Sua compra era no valor de R$" + valorCompraCliente + " para R$" + valorMasComPromocao);
        }
    }
}