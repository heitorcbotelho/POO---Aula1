import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = 0;
        int horasTrabalhadas = 0;
        double salarioHoras = 0.0;

        numeroFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        salarioHoras = scanner.nextDouble();
        
        double salario = salarioHoras * horasTrabalhadas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }
}
