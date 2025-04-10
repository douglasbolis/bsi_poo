package banco;

public class Poupanca extends Conta {

    Poupanca(Gerente gerente) {
        super(gerente);
    }

    Poupanca (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        super(numero, titular, gerente, dtCriacao);
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA POUPANÇA ***");
        super.extrato();
    }

    void rendimento(double juros) {
        this.saldo += this.saldo * (juros / 100);
    }
}
