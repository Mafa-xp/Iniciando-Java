package P04RepiticoesEnquanto;

public class Ex40Contagem03 {
    public static void main(String[] args) {
        int numero = 0;
        boolean comecou = false;

        while(!comecou){
            if (numero == 21){
                System.out.println("Acabou!");
                comecou = true;
            } else{
                System.out.println(numero);
                numero = numero+3;
            }
        }
    }
}

