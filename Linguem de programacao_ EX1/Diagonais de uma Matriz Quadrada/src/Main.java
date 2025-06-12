import java.util.Scanner;
class MatrizQuadrada {
    int [][] matriz;
    int ordem;

    public MatrizQuadrada(int n) {
        ordem = n;
        matriz = new int[n][n];
    }

    public void preencheMatriz(Scanner sc) {
        System.out.println("Digite os valorees da matriz: ");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "] [ " + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public int somaDiagonalPrincipal(){
        int soma = 0;
        for (int i = 0; i < ordem; i++) {
            soma+=matriz[i][i];
        }
        return soma;
    }

    public int somaDiagonalSecundaria(){
        int soma = 0;
        for (int i = 0; i < ordem; i++) {
            soma+=matriz[i][ordem-1-i];
        }
        return soma;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a ordem da matriz quadrada: ");
        int num = sc.nextInt();
        MatrizQuadrada m = new MatrizQuadrada(num);
        m.preencheMatriz(sc);

        int SomaPrincipal = m.somaDiagonalPrincipal();
        int SomaSecundaria = m.somaDiagonalSecundaria();

        System.out.println("Valor da soma da Diagonal Principal: " + SomaPrincipal);
        System.out.println("Valor da soma da diagonal Secundaria: " + SomaSecundaria);
    }
}