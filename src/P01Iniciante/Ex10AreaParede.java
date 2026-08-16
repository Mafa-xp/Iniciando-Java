package P01Iniciante;

import java.util.Scanner;

public class Ex10AreaParede {
    static void main() {
        Scanner leia =  new Scanner(System.in);

        System.out.println("Qual a largura da parede?");
        double larguraParede = leia.nextDouble();

        System.out.println("Qual o comprimento da parede?");
        double comprimentoParede = leia.nextDouble();

        double areaParede = (larguraParede * comprimentoParede) / 2;

        double tintaParede = areaParede / 2;

        System.out.println("A area da parede é "+areaParede+" e tera que usar "+tintaParede+" litros de tinta. ");

    }
}
