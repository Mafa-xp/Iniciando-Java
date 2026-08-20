package P03CondicoesCompostas;

import java.util.Scanner;

public class Ex28LarguraTerreno {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a largura do terreno?");

        double larguraTerrero = leia.nextDouble();

        System.out.println("Qual o comprimento do terreno?");

        double comprimentoTerreno = leia.nextDouble();

        double areaTerreno = (larguraTerrero * comprimentoTerreno) / 2;
        System.out.println("A area do terreno é de " + areaTerreno + "m².");


        if (areaTerreno <= 100) {
            System.out.println("TERRENO POPULAR");

        } else if (areaTerreno >= 500) {
            System.out.println("TERRENO VIP");

        } else {
            System.out.println("TERRENO MASTER");
        }

    }
}
