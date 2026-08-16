package P01Iniciante;

import java.util.Scanner;

public class Ex07DobroeTerçaParte {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Fale um numero: ");
        int numero = leia.nextInt();

        double dobroNumero = numero * 2;
        double tercaParte = numero / 3;

        System.out.println("O dobro do "+numero+" é "+(int)dobroNumero+" e a terça parte de "+numero+" é "+(int)tercaParte);
    }
}
