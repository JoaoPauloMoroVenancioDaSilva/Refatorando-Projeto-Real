public class ListaDinamica {
    private No primeiro;  // armazena o primeiro nó da lista (null)

    // construtor que cria a lista com um primeiro nó  e recebe o conteúdo para o nó
    public ListaDinamica(String conteudo) {
        this.primeiro = new No(conteudo);  // nó com o conteúdo passado
    }

    // método para imprimir todos os conteúdos dos nós da lista
    public void verLista() {
        if(!estaVazio()) {  // analisa se a lista não está vazia
            No aux = primeiro;
            while(aux != null) {  // enquanto o nó atual não for nulo
                System.out.println(aux.getConteudo());  // mostra o conteúdo do nó
                aux = aux.getProx();
            }
        }
    }

    // método que verifica se a lista está vazia
    public boolean estaVazio() {
        if(primeiro == null) {  // verifica se o primeiro nó é null, ou seja, lista vazia
            System.out.println("Adicionando primeiro elemento da lista...");  // indica que a lista está vazia
            return true;  // retorna true se a lista estiver vazia
        } else {
            return false;  // retorna false caso a lista não esteja vazia
        }
    }

    // método que insere um valor no final da lista
    public void inserirValor(String conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazio()) {  // analisa se a lista está vazia
            this.primeiro = novoNo;
        } else {
            No aux = this.primeiro;  // busca o último nó
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);  //  define o novo nó como o próximo do último nó
        }
    }

    // método que remove um valor específico da lista
    public void removerValor(String conteudo) {
        No aux = this.primeiro;  /
        if (this.primeiro.getConteudo().equals(conteudo)) {  // se o primeiro nó contém o valor a ser removido
            this.primeiro = this.primeiro.getProx();
            try {

                while (aux != null) { // enquanto o nó atual não for nulo
                    if (aux.getProx().getConteudo().equals(conteudo)) {   // analisa se o próximo nó contém o valor a ser removido

                        aux.setProx(aux.getProx().getProx());  // remove o nó atual, apontando para o nó seguinte do nó removido
                        return;  // sai do método após a remoção
                    }
                    aux = aux.getProx();
                }
            } catch (Exception e) {
                System.out.println("Não foi possível remover o elemento (" + conteudo + ") da lista, pois não existe!");  // caso não encontre o valor na lista
            }
        }
    }
}
