public abstract class Conta{
    protected
    String titular;
    protected
    double saldo;
    protected
    ContaPremium contaPremium;
    protected
    ContaBasica contaBasica;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaPremium getContaPremium() {
        return contaPremium;
    }

    public void setContaPremium(ContaPremium contaPremium) {
        this.contaPremium = contaPremium;
    }

    public abstract void depositar(double valor);
    public abstract void transferir(double valor, Conta destinatario);
    public abstract void sacar(double valor);

}