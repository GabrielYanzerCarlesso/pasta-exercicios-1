//6. (Lista1_06) Construa um programa em Java para ler (via teclado) uma temperatura em
//graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que
//TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão
//nos resultados (%.1f)). (obs esse eu tive que pedir ajuda pro chatgpt e copilot)

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float tempFahrenheit = scanner.nextFloat();

        // Cálculo da temperatura em Celsius
        float tempCelsius = 5 * (tempFahrenheit - 32) / 9;

        // Exibição do resultado com uma casa decimal
        System.out.printf("A temperatura em graus Celsius é: %.1f%n", tempCelsius);

        scanner.close();
    }
}

//ok
