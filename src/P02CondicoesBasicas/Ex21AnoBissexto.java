
    package P02CondicoesBasicas;

        import java.util.Scanner;

    public class Ex21AnoBissexto {

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            System.out.println("Fale um ano: ");

            int anoInformado = leia.nextInt();

            if (anoInformado % 4 == 0) {

                System.out.println("0 ano "+anoInformado+" é um ano BISSEXTO!!");

            }else{
                System.out.println("0 ano "+anoInformado+" não é um ano BISSEXTO!!");
            }



        }
}
