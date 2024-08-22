//2. (Lista1_02) Construa um programa em Java que leia (via teclado) três números do tipo
//inteiro, calcule e mostre o resultado da soma deles.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // faz a leitura dos números inteiros
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // soma os números
        int soma = numero1 + numero2 + numero3;

        // exibe o resultado final
        System.out.println("A soma de " + numero1 + ", " + numero2 + " e " + numero3 + " é: " + soma);

        scanner.close();
    }
}
//ok