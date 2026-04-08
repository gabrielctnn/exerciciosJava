import java.util.Scanner;

public class ex8 {
    public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        //Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
        System.out.println("Digite um número inteiro inicial:");
        int n1 = scanner.nextInt();
        int n2;
        int resto;
        do {
                System.out.println("Digite outro número inteiro:");
                n2 = scanner.nextInt();

                if (n2 < n1) {
                     System.out.println("Número menor que o inicial. Ignorado...");
                     resto = 0; 
                     continue; 
            }
                resto = n2 % n1;

            if (resto == 0) {
                System.out.printf("O número %d é divisível por %d (Resto 0).%n", n2, n1);
            } else {
                System.out.printf("Resto diferente de zero (%d). Saindo...%n", resto);
            }
        } while (resto == 0);

    scanner.close();
    }
}
