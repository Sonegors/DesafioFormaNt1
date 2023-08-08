import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            if (isPalindrome(palavra)) {
                System.out.println("É um palíndromo!");
            } else {
                System.out.println("Não é um palíndromo!");
            }

            System.out.print("Deseja continuar? (S/N): ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
    }

    public static boolean isPalindrome(String palavra) {
        // Remover espaços em branco e converter tudo para letras minúsculas para evitar problemas de case
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        // Verificar se a palavra é palíndromo comparando-a com sua versão invertida
        return palavra.equals(new StringBuilder(palavra).reverse().toString());
    }
}
