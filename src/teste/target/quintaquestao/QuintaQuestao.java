package teste.target.quintaquestao;
import java.util.Scanner;

public class QuintaQuestao {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para ser invertida:");
        String novaString = scanner.nextLine();

        char caracter[] = novaString.toCharArray();


        for (int i = 0; i < caracter.length / 2; i++) {
            char letras = caracter[i];
            caracter[i] = caracter[caracter.length - 1 - i];
            caracter[caracter.length - 1 - i] = letras;
        }

        String stringInvertida = new String(caracter);
        System.out.println("Segue abaixo a palavara invertida:\n".concat(stringInvertida));


}

}