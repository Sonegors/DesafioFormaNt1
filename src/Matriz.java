
import java.util.Scanner;

public class Matriz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para gerar a matriz identidade: ");
        int numero = scanner.nextInt();

        int[][] matriz = gerarMatrizIdentidade(numero);
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static int[][] gerarMatrizIdentidade(int numero) {
        int[][] matriz = new int[numero][numero];

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
