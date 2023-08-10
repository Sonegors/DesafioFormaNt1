
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do número para gerar a matriz identidade: ");
        int numero = scanner.nextInt();

        int[][] matriz = gerarMatrizIdentidade(numero);
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static int[][] gerarMatrizIdentidade(int tamanho) {
        int[][] matriz = new int[tamanho][tamanho];

        for (int linha = 0; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "    ");
            }
            System.out.println();
        }
    }
}
