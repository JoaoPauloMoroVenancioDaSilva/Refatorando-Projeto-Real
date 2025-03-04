public class ListaSimples {
    private int tamanho;
    Integer [] lista;

    //Construtor da classe Lista Simples
    public ListaSimples(int tamanhoEstrutura) {
        this.tamanho = tamanhoEstrutura;
        lista = new Integer[tamanhoEstrutura];
        System.out.println("A lista criada foi criada com sucesso. Seu tamanho é igual a:" + tamanhoEstrutura);
    }

    //Lista os elementos da Lista
    public void verLista() {
        System.out.println("Exibindo elementos da lista.");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Lista[" + (i+1) + "] = " + this.lista[i]);
        }
    }

    //Insere um valor do tipo int na Lista se tiver espaço, se não houver é mandado uma mensagem
    public void inserirValor(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if(checarIndice(i)) {
                this.lista[i] = valor;
                System.out.println("O valor " + valor + " foi adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Todas posições estão preenchidas.");
    }

    //Verifica se o valor presente no índice selecionado é null
    public boolean checarIndice(int indice) {
        if(this.lista[indice] == null) {
            return true;
        } else {
            return false;
        }
    }

    //Remove um elemento da lista escolhendo o índice
    public void removerPorIndice(int indice) {
        if(checarIntervalo(indice)){
            if(checarIndice(indice)){
                System.out.println("Não existe um valor a ser removido.");
            } else {
                this.lista[indice] = null;
                System.out.println("Valor removido com sucesso.");
            }
        }
    }

    //Verifica se na Lista existe o valor especificado
    public boolean buscaValor(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if(!checarIndice(i)) {
                if(checarValorIndice(valor, i)){
                    System.out.println("O elemento " + valor + " existe na lista.");
                    return true;
                }
            }
        }
        System.out.println("O elemento " + valor + " não existe na lista.");
        return false;
    }

    //Checa se o valor especificado está no índice especificado
    public boolean checarValorIndice(int valor, int indice) {
        if(this.lista[indice] == valor) {
            return true;
        }
        return false;
    }

    //Verifica se o índice especificado está presente na Lista
    public boolean checarIntervalo(int indice) {
        if(indice >= 0 && indice < this.tamanho){
            return true;
        }
        System.out.println("O indice informado está fora do intervalo.");
        return false;
    }
}
