import java.util.Scanner;

class ValorContainer {
    int valor;

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        System.out.print("Digite o valor para objA: ");
        objA.valor = scanner.nextInt();

        System.out.print("Digite o valor para objB: ");
        objB.valor = scanner.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        ValorContainer.trocarValores(objA, objB);

        System.out.println("Depois da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        scanner.close();
    }
}
