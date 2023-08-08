
public class NumPrimos {
    public static void main(String[] args) {
        // Laço de repetição para percorrer os números de 0 a 1000
        for (int i = 0; i <= 1000; i++) {
            if (isPrimo(i)) {
                System.out.println(i); // Imprime o número primo
            }
        }
    }

    // Método para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se o número é divisível por algum valor entre 2 e a raiz quadrada do número, não é primo
            }
        }

        return true; // Se não foi possível encontrar nenhum divisor entre 2 e a raiz quadrada, o número é primo
    }
}
