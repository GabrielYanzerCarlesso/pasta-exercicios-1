//3. (Lista1_03) Construa um programa em Java para ler (via teclado) quatro números do tipo
//inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
//de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
//com duas casas decimais depois da vírgula (%.2f).

import java.util.Scanner;

public class exercicio3parte1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // faz a leitura de todos os números inteiros
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int numero4 = scanner.nextInt();

        // faz o cálculo da média aritmética
        float media = (numero1 + numero2 + numero3 + numero4) / 4.0f;

        // exibe o resultado final com duas casas decimais
        System.out.printf("A média aritmética é: %.2f%n", media);

        scanner.close();
    }
}

//ok
