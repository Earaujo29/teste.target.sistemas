package teste.target.segundaquestao;
import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        
        //Declarando o objeto Scanner para receber numero digitado.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero, por favor:");
        int numero = scanner.nextInt();
        
        if(confereFibonacci(numero)){
            System.out.println("O número "+ numero + " faz parte da Sequência Fibonnaci.");
        }else{
            System.out.println("O número informado não pertence a sequência de Fibonacci!");
        }

    }

    // Criando função do tipo Boleana para fazer a verificação se o número faz parte do Fibonacci.
    public static boolean confereFibonacci(int numero){
        if(numero == 0 || numero ==1){
            return true;
        }

        int x = 0;
        int y = 1 ;

    // laço de repetição para conferir se o valor digitado faz parte do Fibonacci se ele não for 0 ou 1.
        for(int i = 2; y<numero; i++){

            int z = y;
            y = x + y;
            x = z;

        }

        return y == numero;

    }
}
