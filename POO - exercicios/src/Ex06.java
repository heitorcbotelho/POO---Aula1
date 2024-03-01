import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int idpeca1 = scanner.nextInt();
        int quantidadep1 = scanner.nextInt();
        double valorp1 = scanner.nextDouble();
        double valorTotalp1 = quantidadep1 * valorp1;

        int idpeca2 = scanner.nextInt();
        int quantidadep2 = scanner.nextInt();
        double valorp2 = scanner.nextDouble();
        double valorTotalp2 = quantidadep2 * valorp2;

        double total = valorTotalp1 + valorTotalp2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
    
}
