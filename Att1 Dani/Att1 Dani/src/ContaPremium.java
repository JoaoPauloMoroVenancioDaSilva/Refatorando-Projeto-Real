public class ContaPremium extends Conta {

    public ContaPremium(String titular) {
        super(titular);
        setSaldo(1000);
    }

    @Override
    public void depositar(double valor) {
        if (valor>0){
            this.setSaldo(this.getSaldo()+ valor);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    @Override
    public void sacar(double valor){
        if (saldo<valor){
            System.out.println("Não foi possível realizar o saque!");
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
            System.out.println("Tranferência realizada com sucesso!");
        }
    }


    public void transferirSaldoCB(double valor) {
        if (saldo<valor){
            System.out.println("Não foi possível realizar a transferência!");
        }else{
            this.setSaldo(this.getSaldo()-valor);
            contaBasica.setSaldo(contaBasica.getSaldo()+valor);
        }

    }
}