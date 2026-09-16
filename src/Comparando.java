import java.util.Scanner;

public class Comparando {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        int primeiroInteiro=0;
        int segundoInteiro=0;
        System.out.println("Digite 02 números inteiros:");
        primeiroInteiro = leitor.nextInt();
        segundoInteiro = leitor.nextInt();

        if (primeiroInteiro == segundoInteiro) {
            System.out.println("Os números são iguais:"+primeiroInteiro+" e "+segundoInteiro);
        }
        else if (primeiroInteiro != segundoInteiro) {
            System.out.println("Os números são diferentes:"+primeiroInteiro+" e "+segundoInteiro);
        }
        if (primeiroInteiro> segundoInteiro) {
            System.out.println("O primeiro número é maior:"+primeiroInteiro+" e "+segundoInteiro);
        }
    }
}
