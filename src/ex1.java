import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
    /* 
    1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"*/
   Scanner scanner = new Scanner(System.in);
   System.out.println("Informe seu nome:");
   String name = scanner.next();
   System.out.println("Informe o ano que você nasceu:");
   int year = scanner.nextInt();
   
   int age = 2026 - year;

   System.out.printf("Olá %s, você tem %s anos.\n", name, age );

   scanner.close();
    }
}
