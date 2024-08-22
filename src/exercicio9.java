//9. (Lista1_09) Construa um programa em Java para ler (via teclado) 3 valores os quais
//correspondem ao número de convidados para um churrasco, sendo homens, mulheres e
//crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come
//420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne
//necessária para o churrasco em quilogramas e mostre o resultado.

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de convidados
        System.out.print("Digite o número de homens: ");
        int homens = scanner.nextInt();

        System.out.print("Digite o número de mulheres: ");
        int mulheres = scanner.nextInt();

        System.out.print("Digite o número de crianças: ");
        int criancas = scanner.nextInt();

        // Quantidade de carne por pessoa em gramas
        final int CARNE_POR_HOMEM = 650;
        final int CARNE_POR_MULHER = 420;
        final int CARNE_POR_CRIANCA = 290;

        // Cálculo da quantidade total de carne em gramas
        int carneTotalGramas = (homens * CARNE_POR_HOMEM) + (mulheres * CARNE_POR_MULHER) + (criancas * CARNE_POR_CRIANCA);

        // Conversão de gramas para quilogramas
        float carneTotalKg = carneTotalGramas / 1000.0f;

        // Exibição do resultado com duas casas decimais
        System.out.printf("A quantidade total de carne necessária para o churrasco é: %.2f kg%n", carneTotalKg);

        scanner.close();
    }
}
//ok