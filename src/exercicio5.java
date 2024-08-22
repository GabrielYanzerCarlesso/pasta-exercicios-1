//5. (Lista1_05) Construa um programa em Java para ler (via teclado) o raio de um círculo,
//calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
//Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).

    import java.util.Scanner;

    public class exercicio5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // faz a leitura do raio do círculo
            System.out.print("Digite o raio do círculo: ");
            float raio = scanner.nextFloat();
    
            // Definição do valor de pi
            final float PI = 3.141592f;
    
            // Cálculo da área do círculo
            float area = PI * (raio * raio);
    
            // exibe o  resultado com duas casas decimais
            System.out.printf("A área do círculo com raio %.2f é: %.2f%n", raio, area);
    
            scanner.close();
        }
    }
     
//ok
