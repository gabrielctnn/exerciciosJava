import java.util.Scanner;

public class ex2 {
        public static void main(String[] args) throws Exception {
    /* 2.Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    Fórmula: área=lado X lado
    */
    Scanner scanner = new Scanner(System.in);
        System.out.println("CÁLCULO DE ÁREA DO QUADRADO\n");
        System.out.println("Digite o valor de um lado do quadrado:");
        double lado = scanner.nextDouble();

        double area = lado*lado;
        System.out.printf("A área do quadrado é %s", area);
        scanner.close();
    }
}
