public class ContaBasica extends Conta {

    public ContaBasica(String titular) {
        super(titular);
        setSaldo(500);
    }

    @Override
    public void depositar(double valor) {
        if (valor >0){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    @Override
    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Você não possui esse saldo para ser sacado!");
        }else{
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public void transferir(double valor, Conta destinatario) {
        if (valor > 0){
            destinatario.depositar(valor);
            setSaldo(this.getSaldo()-valor);
            System.out.println("Tranferencia realizada!");
        }
    }


}