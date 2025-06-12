import java.util.Scanner;
class CalcularFatorial{
    public long calcularFatorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num*calcularFatorial(num-1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Número inválido, não pode ser negativo");
        }
        else{
            CalcularFatorial c = new CalcularFatorial();
            System.out.println("Fatorial de "+num +" é: "+c.calcularFatorial(num));
        }


    }
}