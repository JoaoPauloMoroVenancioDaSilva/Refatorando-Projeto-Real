public class ListaDinamica {
    private No primeiro;

    //Construtor da Lista Dinâmica, também é inserido o primeiro valor
    public ListaDinamica(String conteudo) {
        this.primeiro = new No(conteudo);
    }

    //Lista os elementos da Lista
    public void verLista() {
        if(!estaVazio()) {
            No aux = primeiro;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    //Verifica se a lista está vazia
    public boolean estaVazio() {
        if(primeiro == null) {
            System.out.println("Adicione/Adicionando o primeiro elemento da lista...");
            return true;
        } else {
            return false;
        }
    }

    //Insere um valor na lista
    public void inserirValor(String conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazio()) {
            this.primeiro = novoNo;
        }else {
            No aux = this.primeiro;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    //Remove um valor presente na lista
    public void removerValor(String conteudo) {
        No aux = this.primeiro;
        if (this.primeiro.getConteudo().equals(conteudo)) {//Removendo primeiro elemento
            this.primeiro = this.primeiro.getProx();
        } else {
            try {
                while (aux != null) {
                    if (aux.getProx().getConteudo().equals(conteudo)) {
                        aux.setProx(aux.getProx().getProx());
                        return;
                    }
                    aux = aux.getProx();
                }
            }catch (Exception e) {
                System.out.println("Não foi possível remover o elemento (" + conteudo+ ") da lista, pois não existe!");
            }
        }
    }
}
