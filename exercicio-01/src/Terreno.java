import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura;
        double comprimento;
        double valorMetroQuadrado;
        double area;
        double preco;

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        valorMetroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * valorMetroQuadrado;

        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", preco);

        sc.close();
    }
}
