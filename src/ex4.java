import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
    // 4.Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
      Scanner scanner = new Scanner(System.in);
        System.out.println("CÁLCULO DE DIFERENÇA DE IDADE \n");
        System.out.println("Digite o nome da primeira pessoa:");
        String p1 = scanner.next();
        System.out.printf("Digite a idade de %s:\n", p1);
        int idadeP1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa:");
        String p2 = scanner.next();
        System.out.printf("Digite a idade de %s:\n", p2);
       int idadeP2 = scanner.nextInt();

       int diferencaIdade = idadeP1 - idadeP2;

       System.out.printf("A diferença de idade de %s para %s é de %s ano(s).", p1, p2, diferencaIdade);
        scanner.close();
    }
}
