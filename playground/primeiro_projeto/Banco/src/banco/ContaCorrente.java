package banco;

public class ContaCorrente extends Conta {
    double limite;

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
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    boolean sacar(double valor) {
        System.out.println("Realizando saque na conta " + this.numero);

        if (this.disponivel() < valor) {
            System.out.println("Erro: não foi possível sacar R$ " + valor);
            System.out.println("Valor disponível para saque: R$ " + this.disponivel() + "\n");
            return false;
        }

        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        System.out.println("Novo saldo em " + this.numero + ": R$ " + this.saldo + "\n");
        return true;
    }

    void transferir(double valor, Conta destino) {
        System.out.println("Realizando transferência");
        System.out.println("Origem: " + this.numero + " - Destino: " + destino.numero);

        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso\n");
        } else {
            System.out.println("Erro: não foi possível transferir R$ " + valor);
            System.out.println("Valor disponível para transferência: R$ " + this.disponivel() + "\n");
        }
    }

    void chequeEspecial(double juros) {
        if (this.saldo < 0) {
            this.saldo += this.saldo * (juros / 100);
        }
    }
}
