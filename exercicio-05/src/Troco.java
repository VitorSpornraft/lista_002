import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario;
        int quantidadeComprada;
        double dinheiroRecebido;
        double valorTotal;
        double troco;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidadeComprada = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        valorTotal = precoUnitario * quantidadeComprada;
        troco = dinheiroRecebido - valorTotal;

        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}