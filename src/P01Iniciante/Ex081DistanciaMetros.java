package P01Iniciante;

import java.util.Scanner;

public class Ex081DistanciaMetros {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Fale uma distância em Metros: ");
        double distanciaMetros = leia.nextDouble();

        double MetrosparaDM = distanciaMetros * 10;
        double DMparaCM = MetrosparaDM * 10;
        double CMparaMM = DMparaCM  * 10;

        double MetrosparaDAM = distanciaMetros / 10;
        double DAMparaHM = MetrosparaDAM / 10;
        double HMparaKM = DAMparaHM / 10;

        System.out.println("a distância de "+distanciaMetros+"m, corresponde a: ");
        System.out.println(HMparaKM+"KM" +"\t\t\t\t" + MetrosparaDM+"dm");
        System.out.println(DAMparaHM+"Hm" +"\t\t\t\t" + DMparaCM+"cm");
        System.out.println(MetrosparaDAM+"Dam"+"\t\t\t\t\t\t\t\t" + CMparaMM+"mm");
    }

}

