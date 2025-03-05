import java.util.Scanner;

public class MainListaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ListaSimples listaSimples = null;  // Define a lista sem valor para que o usuário coloque os números

        System.out.println("Olá, bem vindo ao criador de Listas Simples! Você poderá criar 1 lista e modifica-lá. " +
                "Para mexer com outra, será necessário rodar o programa novamente. Muito obrigado.");

        // menu de opções para o usuário interagir
        do {
            System.out.println("\nEscolha a sua opção\n" +
                    "1 - Criar Lista Simples e o número de índices que ela possui\n" +
                    "2 - Inserir Valor\n" +
                    "3 - Remover valor por índice\n" +
                    "4 - Ver Lista\n" +
                    "5 - Sair\n" +
                    "Escolha a opção");
            opcao = scanner.nextInt();  //serve para ler a opção que o usuário escolheu
            while(opcao <= 0 || opcao > 5){  // valida da opção
                System.out.println("Opção inválida. Escolha a opção novamente!");  // volta para o menu caso o usuário tenha selecionado um opção invalida
                opcao = scanner.nextInt();
            }

            // verifica o que o usuário quer realizar
            switch (opcao) {
                case 1:
                    // nova lista
                    if (listaSimples == null) {  // analisa se a lista ainda não foi criada
                        System.out.println("Informe o tamanho da Lista");  // tamanho da lista
                        int tamanho = scanner.nextInt();
                        while (tamanho <= 0) {  // analisa se o tamanho informado é válido
                            System.out.println("Informe novamente o tamanho da Lista:");  // pede o tamanho novamente caso o tamanho seja inválido
                            tamanho = scanner.nextInt();  // novo tamanho
                        }
                        listaSimples = new ListaSimples(tamanho);  // nova lista com o tamanho informado
                    }
                    else {
                        System.out.println("Já foi criada uma lista.");  // se existir uma lista, fala pro usuário
                    }
                    break;

                case 2:
                    // inserir um valor na lista
                    if (listaSimples != null) {  // analisa se a lista já foi criada
                        System.out.println("Informe o valor a ser inserido na Lista:");  // pede valor a ser inserido
                        int valor = scanner.nextInt();  // lê valor a ser inserido
                        listaSimples.inserirValor(valor);  // chama o método para inserir o valor na lista
                    } else {
                        System.out.println("Crie uma lista primeiro");  // caso a lista não tenha sido criada, pede para o usuário criar uma lista
                    }
                    break;

                case 3:
                    // remover um valor da lista
                    if (listaSimples != null) {  // analisa se a lista já foi criada
                        System.out.println("Informe o valor do índice a ser removido da Lista:");  // escolhe o número a ser removido
                        int indice = scanner.nextInt();  // lê o índice
                        listaSimples.removerPorIndice(indice - 1);  // chama o método para remover o valor na posição indicada
                    } else {
                        System.out.println("Crie uma lista primeiro.");  // caso a lista não tenha sido criada,pede para o usuário criar uma lista
                    }
                    break;

                case 4:
                    // visualizar a lista
                    if (listaSimples != null) {  // analisa se a lista já foi criada
                        listaSimples.verLista();  // chama o método para mostrar os elementos da lista
                    } else {
                        System.out.println("Crie uma lista primeiro.");  // caso a lista não tenha sido criada, pede para o usuário criar uma lista
                    }
                    break;

                case 5:
                    // sair do programa
                    System.out.println("Fim do programa. Muito obrigado por ter utilizado.");  //mensagem de despedida
                    break;
                default:
                    // caso a opção escolhida seja inválida (não esteja entre 1 e 5)

                    System.out.println("Opção inválida. Escolha outra.");
            }

        }while (opcao != 5);  // o programa continua rodando até que a opção 5 seja escolhida (sair)
    }
}
