import java.util.Locale;
import java.util.Scanner;

public class Curriculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double area;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        area = Math.PI * raio * raio;

        System.out.printf("AREA = %.3f%n", area);

        sc.close();
    }
}