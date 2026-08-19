package P04RepiticoesEnquanto;

public class Ex39Contagem02 {
    public static void main(String[] args) {
        int numero = 10;
        boolean comecou = false;

        while(!comecou){
            if (numero == 2){
                System.out.println("Acabou!");
                comecou = true;
            } else{
                System.out.println(numero);
                numero--;
            }
        }
    }
}

