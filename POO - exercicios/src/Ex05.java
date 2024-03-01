import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salario = comissao + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", salario);
    }
}