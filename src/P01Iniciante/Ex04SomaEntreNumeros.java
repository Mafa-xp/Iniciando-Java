package P01Iniciante;


import java.util.Scanner;

public class Ex04SomaEntreNumeros {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorA = leia.nextInt();

        System.out.println("Digite um outro valor: ");
        int valorB = leia.nextInt();

        double soma = valorA + valorB;

        System.out.println("A soma de "+valorA+" e "+valorB +" é igual a "+(int)soma);



    }
}
