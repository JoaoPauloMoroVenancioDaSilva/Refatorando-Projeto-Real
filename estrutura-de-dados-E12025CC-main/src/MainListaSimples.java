import java.util.Scanner;

public class MainListaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ListaSimples listaSimples = null;
        
        System.out.println("Olá, bem vindo ao criador de Listas Simples! Você poderá criar 1 lista e modifica-lá. " +
                "Para mexer com outra, será necessário rodar o programa novamente. Muito obrigado.");

        do {
            System.out.println("\nEscolha a sua opção\n" +
                    "1 - Criar Lista Simples e o número de índices que ela possui\n" +
                    "2 - Inserir Valor\n" +
                    "3 - Remover valor por índice\n" +
                    "4 - Ver Lista\n" +
                    "5 - Sair\n" +
                    "Escolha a opção");
            opcao = scanner.nextInt();
            while(opcao <= 0 || opcao > 5){
                System.out.println("Opção inválida. Escolha a opção novamente!");
                opcao = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    if (listaSimples == null) {
                        System.out.println("Informe o tamanho da Lista");
                        int tamanho = scanner.nextInt();
                        while (tamanho <= 0) {
                            System.out.println("Informe novamente o tamanho da Lista:");
                            tamanho = scanner.nextInt();
                        }
                        listaSimples = new ListaSimples(tamanho);
                    }
                    else {
                        System.out.println("Já foi criada uma lista.");
                    }
                    break;

                case 2:
                    if (listaSimples != null) {
                        System.out.println("Informe o valor a ser inserido na Lista:");
                        int valor = scanner.nextInt();
                        listaSimples.inserirValor(valor);
                    } else {
                        System.out.println("Crie uma lista primeiro");
                    }
                    break;

                case 3:
                    if (listaSimples != null) {
                        System.out.println("Informe o valor do índice a ser removido da Lista:");
                        int indice = scanner.nextInt();
                        listaSimples.removerPorIndice(indice - 1);
                    } else {
                        System.out.println("Crie uma lista primeiro.");
                    }
                    break;

                case 4:
                    if (listaSimples != null) {
                        listaSimples.verLista();
                    } else {
                        System.out.println("Crie uma lista primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("Fim do programa. Muito obrigado por ter utilizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha outra.");

            }

        }while (opcao != 5);
    }
}
