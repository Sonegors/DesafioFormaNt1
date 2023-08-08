
import java.math.BigDecimal;
import java.util.Scanner;

public class MenorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do custo: R$ ");
        BigDecimal custo = lerValor(scanner);

        System.out.print("Digite o valor do pagamento: R$ ");
        BigDecimal pagamento = lerValor(scanner);

        BigDecimal troco = pagamento.subtract(custo);

        System.out.println("Troco: R$ " + formatarDecimal(troco));

        System.out.println("Menor troco:");
        BigDecimal[] notasMoedas = {
                new BigDecimal("100"), new BigDecimal("50"), new BigDecimal("20"),
                new BigDecimal("10"), new BigDecimal("5"), new BigDecimal("2"),
                new BigDecimal("1"), new BigDecimal("0.5"), new BigDecimal("0.25"),
                new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")
        };

        for (BigDecimal valor : notasMoedas) {
            int quantidade = troco.divide(valor, 0, BigDecimal.ROUND_DOWN).intValue();
            if (quantidade > 0) {
                System.out.println(quantidade + " - " + (valor.compareTo(BigDecimal.ONE) >= 0 ? "nota de " : "moeda de ") + formatarDecimal(valor));
                troco = troco.remainder(valor);
            }
        }
    }

    public static BigDecimal lerValor(Scanner scanner) {
        String valorStr = scanner.next();
        valorStr = valorStr.replaceAll("[^0-9.,]", ""); // Remove caracteres não numéricos, exceto ponto e vírgula
        valorStr = valorStr.replace(',', '.'); // Substitui vírgula por ponto
        return new BigDecimal(valorStr);
    }

    public static String formatarDecimal(BigDecimal valor) {
        return valor.setScale(2).toString();
    }
}


