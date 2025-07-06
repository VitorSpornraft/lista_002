import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorPorHora;
        int horasTrabalhadas;
        double pagamento;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valorPorHora = sc.nextDouble();
        sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        sc.nextLine();

        pagamento = valorPorHora * horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser %.2f%n", nome, pagamento);

        sc.close();
    }
}