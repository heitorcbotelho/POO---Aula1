import java.util.Scanner;

public class Ex0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = "";
        Double salario = 0.;
        Double percentualAumento = 0.;

        nomeCompleto = scanner.nextLine();
        salario = scanner.nextDouble();
        percentualAumento = scanner.nextDouble();

        String primeiroNome = primeiroNome(nomeCompleto);
        System.out.println(primeiroNome);

        Double novoSalario = aumento(salario, percentualAumento);
        System.out.println(novoSalario);

    }

    public static String primeiroNome(String nome) {
        String[] nomes = nome.split(" ");
        return nomes[0];
    }

    public static Double aumento(Double salario, Double percentual) {
        Double novoSalario = salario + (salario * percentual/100);
        return novoSalario;
    }
}