package P02CondicoesBasicas;

import java.util.Scanner;

public class Ex24DistanciaPassageiro {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a distância que você deseja percorrer em KM?");

        double distanciaPassageiro = leia.nextDouble();

        if (distanciaPassageiro >= 200) {
            double viagemCurta = distanciaPassageiro * 0.5;
            System.out.println("Sua viagem custara " + viagemCurta);

        } else {
            double viagemLonga = distanciaPassageiro * 0.45;
            System.out.println("Sua viagem custara " + viagemLonga);
        }
    }
}
