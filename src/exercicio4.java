//4. (Lista1_04) Construa um programa em Java que leia um número do tipo “inteiro” (via
//teclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
//de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
//de X pela metade de X.

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int X = scanner.nextInt();

        // (1) O conteúdo de X
        System.out.println("O conteúdo de X é: " + X);

        // (2) O quadrado de X
        int quadrado = X * X;
        System.out.println("O quadrado de X é: " + quadrado);

        // (3) o restante da divisão inteira do número X por 3
        int restoDivisao = X % 3;
        System.out.println("O resto da divisão inteira de X por 3 é: " + restoDivisao);

        // (4) A metade de X
        float metade = X / 2.0f;
        System.out.printf("A metade de X é: %.2f%n", metade);

        // (5) O resultado do produto de X pela metade de X
        float produto = X * metade;
        System.out.printf("O produto de X pela metade de X é: %.2f%n", produto);

        scanner.close();
    }
}
//ok
