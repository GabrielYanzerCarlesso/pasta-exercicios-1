//1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
//calcule o produto entre eles e mostre o resultado.

import java.util.Scanner;


    public class exercicio1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // faz a leitura dos números
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
    
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
    
            // cálcula o produto
            int produto = numero1 * numero2;
    
            // Exibe o resultado final
            System.out.println("O produto de " + numero1 + " e " + numero2 + " é: " + produto);
    
            scanner.close();
        }
    }

    //ok
    