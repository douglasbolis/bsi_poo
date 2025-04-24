package banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Gerente gerente) {
        super(gerente);
        this.limite = 200;
    }

    public ContaCorrente (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        this(numero, titular, gerente, dtCriacao, 200);
    }

    public ContaCorrente (String numero, Pessoa titular, Gerente gerente, Data dtCriacao, double limite) {
        super(numero, titular, gerente, dtCriacao);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(String senha, double limite) {
        if (this.getGerente().validarAcesso(senha)) {
            System.out.println("Limite da conta " + this.getNumero() + " alterado com sucesso.");
            System.out.println("Novo limite R$ " + this.getLimite() + ".");
            this.limite = limite;
        } else {
            System.out.println("Senha incorreta.");
            System.out.println("Não foi possível alterar o limite da conta.");
        }
    }

    public double disponivel() {
        return this.getSaldo() + this.getLimite();
    }

    public void extrato() {
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
    }

    public void chequeEspecial(double juros) {
        if (this.getSaldo() < 0) {
            this.setSaldo(this.getSaldo() + this.getSaldo() * (juros / 100));
        }
    }
}
