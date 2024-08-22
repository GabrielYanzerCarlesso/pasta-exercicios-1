//8. (Lista1_08) Construa um programa em Java que leia (via teclado) as horas, minutos e
//segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos
//decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).


import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das horas, minutos e segundos
        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        // Cálculo do total de segundos
        int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        // Exibição do resultado
        System.out.println("O total de segundos decorridos neste dia é: " + totalSegundos);

        scanner.close();
    }
}
//ok