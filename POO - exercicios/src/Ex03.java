import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //Cria um objeto Scanner para ler a entrada do usuário a partir do console
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que insira o valor do raio e armazena-o na variável raio
        double raio = scanner.nextDouble();
        double area = 3.14159 * (raio * raio);
        // Imprime a área do círculo com 4 casas decimais
        String areaf = String.format("%.4f", area);

        System.out.println("A=" + areaf);
    }
}
