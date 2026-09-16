import java.util.Scanner;

public class Condicional {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado =0;

        System.out.println("Digite um número:");
        numeroGerado = leitor.nextInt();

        if (numeroGerado % 2 == 0) {
            System.out.println("Seu número é Par:");
        }
        else if (numeroGerado % 2 !=0 ){
            System.out.println("Seu número é Ímpar");

        }
    }
}
