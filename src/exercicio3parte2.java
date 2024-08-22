//3.1. (Lista1_03_1) A mesma especificação do exercício anterior (Lista1_03) só que
//agora usando números do tipo float (com duas casas decimas depois da vírgula (%.2f)).
    
    import java.util.Scanner;

    public class exercicio3parte2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura dos números float
            System.out.print("Digite o primeiro número: ");
            float numero1 = scanner.nextFloat();
    
            System.out.print("Digite o segundo número: ");
            float numero2 = scanner.nextFloat();
    
            System.out.print("Digite o terceiro número: ");
            float numero3 = scanner.nextFloat();
    
            System.out.print("Digite o quarto número: ");
            float numero4 = scanner.nextFloat();
    
            // faz o cálculo da média aritmética
            float media = (numero1 + numero2 + numero3 + numero4) / 4;
    
            // exibe o resultado final com duas casas decimais
            System.out.printf("A média aritmética é: %.2f%n", media);
    
            scanner.close();
        }
    }
    
    //ok