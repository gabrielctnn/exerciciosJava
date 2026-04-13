import java.util.Scanner;

public class Desafio_03 {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* Desafio:
         Você foi contratado como consultor júnior em uma empresa de Tecnologia da Informação que está modernizando seus sistemas. Seu primeiro desafio é ajudar a equipe a padronizar nomes de projetos, que chegam em diferentes formatos e estilos. Para garantir a organização dos arquivos, todos os nomes de projetos devem ser convertidos para letras maiúsculas. Além disso, se o nome do projeto estiver vazio ou contiver apenas espaços, você deve alertar a equipe informando que o nome é inválido. Sua tarefa é criar um programa que receba o nome de um projeto e retorne o nome em letras maiúsculas, ou a mensagem "INVALIDO" caso o nome seja vazio ou apenas espaços.

        Implemente uma solução simples, sem o uso de bibliotecas externas, que leia uma linha contendo o nome do projeto e produza a saída conforme as regras acima. Certifique-se de tratar corretamente casos em que o nome está em branco ou contém apenas espaços.
         */
        System.out.println("---- TRANSCRIÇÃO NOME PROJETO PARA MAIUSCULO E VERIFICAÇÃO DE PREENCHIMENTO VAZIO ----%n");

        // Requerimento/Leitura do nome dos projetos
        System.out.println("Insira o nome do projeto:");
        String nomeProjeto = scanner.nextLine();

        // Removendo  espaço vazio
        nomeProjeto = nomeProjeto.trim();

        // Verificação se não tem nada escrito no nome do projeto
        if (nomeProjeto.isEmpty()) {
            System.out.println("INVALIDO");
        } else{
            System.out.printf("Nome do projeto: %s",nomeProjeto.toUpperCase());
        }

        scanner.close();
    }
}
