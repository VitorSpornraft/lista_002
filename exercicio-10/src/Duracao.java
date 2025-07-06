import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int duracaoEmSegundos;
        int horas;
        int minutos;
        int segundos;

        System.out.print("Digite a duracao em segundos: ");
        duracaoEmSegundos = sc.nextInt();

        horas = duracaoEmSegundos / 3600;
        minutos = (duracaoEmSegundos % 3600) / 60;
        segundos = duracaoEmSegundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}