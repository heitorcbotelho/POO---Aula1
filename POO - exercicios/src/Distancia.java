import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();
        int resultado = calculaDistancia(km);

        System.out.println(resultado + "minutos");
    }

    public static int calculaDistancia (int outroKm) {
        return outroKm * 2;
    }
}
