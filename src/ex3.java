import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        /* 3.Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
    fórmula: área=base X altura */
        Scanner scanner = new Scanner(System.in);
        System.out.println("CÁLCULO DE ÁREA DO TRIÂNGULO\n");
        System.out.println("Digite o valor da base do triângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do triângulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        
        System.out.printf("A área do triângulo é %s",area);


        scanner.close();
    }
}
