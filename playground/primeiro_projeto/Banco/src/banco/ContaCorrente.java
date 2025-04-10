package banco;

public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente(Gerente gerente) {
        super(gerente);
        this.limite = 200;
    }

    ContaCorrente (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        this(numero, titular, gerente, dtCriacao, 200);
    }

    ContaCorrente (String numero, Pessoa titular, Gerente gerente, Data dtCriacao, double limite) {
        super(numero, titular, gerente, dtCriacao);
        this.limite = limite;
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void extrato() {
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
    }

    void alterarLimite(double limite) {
        if (this.gerente.validarAcesso()) {
            System.out.println("Limite da conta " + this.numero + " alterado com sucesso.");
            System.out.println("Novo limite R$ " + this.limite + ".");
            this.limite = limite;
        } else {
            System.out.println("Senha incorreta.");
            System.out.println("Não foi possível alterar o limite da conta.");
        }
    }

    void chequeEspecial(double juros) {
        if (this.saldo < 0) {
            this.saldo += this.saldo * (juros / 100);
        }
    }
}
