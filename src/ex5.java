import java.util.Scanner;

public class ex5 {
    public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    //  Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
    System.out.println("###### TABUADA ###### \n");
    System.out.println("Digite um número para gerar a tabuada:");
    int numero = scanner.nextInt();

    for (int i= 1; i <=10; i++) {
        int tabuada = numero * i;
        System.out.printf("%s x %s = %s\n", numero, i, tabuada);
    }


    scanner.close();
    }
}
