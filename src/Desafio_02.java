import java.util.Scanner;

public class Desafio_02 {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* Desafio:
         Você foi contratado como consultor júnior em uma empresa de Tecnologia da Informação que está modernizando seus sistemas. Seu primeiro desafio é ajudar a equipe a padronizar a identificação de projetos internos. Cada projeto recebe um nome, mas para facilitar buscas e integrações, todos os nomes devem ser convertidos para letras maiúsculas. Além disso, a equipe deseja saber quantos caracteres o nome do projeto possui, para garantir que não ultrapasse o limite permitido pelo sistema legado. Sua tarefa é criar um programa que, dado o nome de um projeto, retorne o nome em letras maiúsculas seguido do número de caracteres, separados por um espaço.

        Implemente uma solução que leia uma linha contendo o nome do projeto e produza uma linha de saída com o nome em maiúsculas e o comprimento do nome, separados por um espaço. Não utilize bibliotecas externas, apenas recursos padrão da linguagem. Considere que o nome do projeto pode conter letras, números e espaços, e nunca estará vazio.
         */
        System.out.println("---- TRANSCRIÇÃO NOME PROJETO PARA MAIUSCULO E QUANTIDADE DE CARACTERES ----%n");

        // Requerimento/Leitura do nome dos projetos
        System.out.println("Insira o nome do projeto:");
        String nomeProjeto = scanner.nextLine();

        // Convertendo o nome do projeto para maiúsculo
        nomeProjeto = nomeProjeto.toUpperCase();

        // Contagem de caracteres do nome do projeto
        int qtdCaracteres = nomeProjeto.length();
        System.out.printf("Nome projeto:%s. Quantidade de caracteres %s ", nomeProjeto, qtdCaracteres);

        scanner.close();
    }
}
