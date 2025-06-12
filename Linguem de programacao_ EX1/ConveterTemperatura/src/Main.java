import java.util.Scanner;

class ConversorTemperatura {
    public double CelsiusParaFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
    public double FahrenheitParaCelsius(double f) {
        return (f -32) + 5/9;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("Opção: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Temperatura Celsius: ");
                double celsius = sc.nextDouble();
                celsius = conversor.CelsiusParaFahrenheit(celsius);
                System.out.println("Conversão de Celsius para Fahrenheit: "+celsius);
                break;
            case 2:
                System.out.println("Temperatura Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                fahrenheit = conversor.FahrenheitParaCelsius(fahrenheit);
                System.out.println("Conversão de Fahrenheit para Celsisus: "+fahrenheit);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}