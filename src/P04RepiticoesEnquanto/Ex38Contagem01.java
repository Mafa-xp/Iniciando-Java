package P04RepiticoesEnquanto;

public class Ex38Contagem01 {
    public static void main(String[] args) {
        int numero = 6;
        boolean comecou = false;

        while(!comecou){
            if (numero == 12){
                System.out.println("Acabou!");
                comecou = true;
            } else if (numero <= 11){
                System.out.println(numero);
                numero++;
            }
        }
    }
}

