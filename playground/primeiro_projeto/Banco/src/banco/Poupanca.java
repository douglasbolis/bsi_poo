package banco;

public class Poupanca extends Conta {
    public Poupanca(Gerente gerente) {
        super(gerente);
    }

    public Poupanca (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        super(numero, titular, gerente, dtCriacao);
    }

    public void extrato() {
        System.out.println("*** EXTRATO DA CONTA POUPANÇA ***");
        super.extrato();
    }

    public void rendimento(double juros) {
        this.setSaldo(this.getSaldo() + this.getSaldo() * (juros / 100));
    }
}
