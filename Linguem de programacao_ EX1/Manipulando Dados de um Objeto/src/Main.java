import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        System.out.println("Endereco de memória: " + System.identityHashCode(numero));

    }
}