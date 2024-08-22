//7. (Lista1_07) Construa um programa em Java que leia (via teclado) um comprimento em
//polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando
//que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão
//nos resultados (%.1f)).



import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // faz a leitura do comprimento em polegadas
        System.out.print("Digite o comprimento em polegadas: ");
        float polegadas = scanner.nextFloat();

        // converte de polegadas para milímetros
        float milimetros = polegadas * 25.4f;

        // exibe o resultado final com uma casa decimal
        System.out.printf("O comprimento em milímetros é: %.1f mm%n", milimetros);

        scanner.close();
    }
}

//ok
