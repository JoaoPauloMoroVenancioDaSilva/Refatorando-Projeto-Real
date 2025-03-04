import java.util.Scanner;

public class MainListaDinamica {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        ListaDinamica listaDinamica = null;


        System.out.println("Olá, bem vindo ao criador de Listas Dinâmicas! Você poderá criar 1 lista e modifica-lá. " +
                "Para mexer com outra, será necessário rodar o programa novamente. Muito obrigado.");

        do {
            System.out.println("\nEscolha a sua opção\n" +
                    "1 - Criar Lista/ Inserir Valor\n" +
                    "2 - Remover valor por índice\n" +
                    "3 - Ver Lista\n" +
                    "4 - Sair\n" +
                    "Escolha a opção");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    if (listaDinamica == null) {
                        System.out.print("Digite o primeiro valor da lista: ");
                        String valorInicial = scanner.nextLine();
                        listaDinamica = new ListaDinamica(valorInicial);
                    } else {
                        System.out.print("Digite um valor para inserir: ");
                        String valorInserir = scanner.nextLine();
                        listaDinamica.inserirValor(valorInserir);
                    }
                    break;

                case 7:
                    if (listaDinamica != null) {

                    } else {
                        System.out.println("Crie a lista primeiro!");
                    }
                    break;

                case 2:
                    if (listaDinamica != null) {
                        System.out.print("Digite um valor para remover: ");
                        String valorRemover = scanner.nextLine();
                        listaDinamica.removerValor(valorRemover);
                    } else {
                        System.out.println("Crie a lista primeiro!");
                    }
                    break;

                case 3:
                    if (listaDinamica != null) {
                        listaDinamica.verLista();
                    } else {
                        System.out.println("Crie a lista primeiro!");
                    }
                    break;

                case 4:
                    System.out.println("Fim do programa. Muito obrigado por ter utilizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha outra.");
            }
        }while (opcao != 4);
    }
}
