import java.util.Scanner;
class Matriz{
    int[][] matriz;

    public Matriz(int l, int c){
        matriz = new int[l][c];
    }

    public void preencherMatriz(Scanner sc){
        System.out.println("Digite os valores da Matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public int maior(){
        int maior = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j]> maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public int menor(){
        int menor = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores da Matriz ");
        System.out.println("Linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Colunas: ");
        int colunas = sc.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);
        matriz.preencherMatriz(sc);

        int maior = matriz.maior();
        int menor = matriz.menor();

        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);
    }
}