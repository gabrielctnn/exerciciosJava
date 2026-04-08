import java.util.Scanner;

public class ex7 {
    public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
       //Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
       
       System.out.println("Digite um número inteiro:");
       int n1 = scanner.nextInt();
       System.out.println("Digite um valor maior que o outro:");
       int n2 = scanner.nextInt();
        System.out.println("Escolha entre par e ímpar. (p/i)");
        String escolha = scanner.next();

        switch (escolha) {
            case "p": 
            System.out.printf("Números pares de %s até %s\n", n2,n1);
            for(int i = n2; i >= n1; i--){
                if (i % 2 == 0) {
                    System.out.printf("%s\n",i);
                } 
            };
            break;
            case "i": 
                   System.out.printf("Números ímpares de %s até %s\n", n2,n1);
            for(int i = n2; i >= n1; i--){
                if (i % 2 != 0) {
                    System.out.printf("%s\n",i);
                } 
            };
            break;
            default: System.out.println("Opção inválida!");
        }
    scanner.close();
    }
}
