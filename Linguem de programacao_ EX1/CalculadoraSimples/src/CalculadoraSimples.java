import java.util.Scanner;

public class CalculadoraSimples {

    
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraSimples calc = new CalculadoraSimples();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = calc.dividir(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
