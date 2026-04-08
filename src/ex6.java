import java.util.Scanner;

public class ex6 {
    public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        /*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC
        (IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        Se for menor ou igual a 18,5 "Abaixo do peso";
        Se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */

        System.out.println("###### CÁLCULO IMC ######\n");
        System.out.println("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de %s\n", imc);
        if (imc <= 18.5 ){
            System.out.printf("Você está abaixo do peso!");
        } else if ( imc >= 18.6 && imc <= 24.9) {
            System.out.printf("Você está no peso ideal!");
        } else if ( imc > 24.9 && imc <= 29.9){
            System.out.printf("Você está levemente acima do peso!");
        } else if ( imc >= 29.9 && imc <= 34.9){
            System.out.printf("Você está com Obesidade Grau I!");
        } else if ( imc >= 34.9 && imc <= 39.9){
            System.out.printf("Você está com Obesidade Grau II (Severa)!");
        }  else if ( imc >= 40){
            System.out.printf("Você está com Obesidade Grau III (Mórbida)!");
        }
    scanner.close();
    }
}
