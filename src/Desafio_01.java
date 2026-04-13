import java.util.Scanner;

public class Desafio_01 {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* Desafio:
           Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
            Para realizar o cálculo, receba o valor bruto do salário e o adicional dos benefícios.
            O salário a ser transferido é calculado da seguinte maneira:
            (valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefício)
            Para calcular o percentual de imposto, segue as alíquotas:
            De R$ 0.00 a R$ 1100.00 = 5.00%
            De R$ 1100.01 a R$ 2500.00 = 10.00%
            Maior que R$ 2500.00 = 15.00%
         */
        System.out.println("---- CÁLCULO SÁLARIO FUNCIONÁRIO ----%n");

        // Requerimento/Leitura das informações
        System.out.println("Insira o seu salário bruto:");
        double salario = scanner.nextDouble();
        System.out.println("Insira o seu bônus adicional dos benefícios:");
        double bonusAdicional = scanner.nextDouble();
        double percentualImposto;

        //Verificação de qual percentual baseado no salário
        if (salario > 2500) {
            percentualImposto = 0.15;
        } else if (salario > 1100.01) {
            percentualImposto = 0.1;
        } else {
            percentualImposto = 0.05;
        }

        //Calculo final do salario com imposto e bonificação
        double salarioMedianteImposto = salario * percentualImposto;
        double salarioFinal = (salario - salarioMedianteImposto) + bonusAdicional;

        System.out.printf("Você recebera o seguinte salário:R$%s.\n \n", salarioFinal);
        System.out.printf("O seu salário é de R$%s.\n", salario);
        System.out.printf("Obteve um imposto de %.0f%%.\n", (percentualImposto * 100));
        System.out.printf("E um bônus adicional ds R$%s", bonusAdicional);

        scanner.close();
    }
}
