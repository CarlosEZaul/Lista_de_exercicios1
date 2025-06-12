import java.util.Scanner;
class verificar{
    public boolean palindromo(String texto){
        String limpo = texto.replaceAll("\\s+","").toLowerCase();
        String invertido = new StringBuilder(limpo).reverse().toString();
        return invertido.equals(texto);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificar ver = new verificar();
        System.out.println("Digite o texto: ");
        String entrada = sc.nextLine();
        boolean resultado = ver.palindromo(entrada);
        if(resultado){
            System.out.println("Palindromo");
        }
        else{
            System.out.println("Nao palindromo");
        }
        sc.close();
    }
}