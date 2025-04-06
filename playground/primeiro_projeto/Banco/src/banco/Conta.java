package banco;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data dtCriacao;
    Gerente gerente;

    Conta (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        this.numero = numero;
        this.titular = titular;
        this.gerente = gerente;
        this.dtCriacao = dtCriacao;
        this.saldo = 0;
    }

    void depositar(double valor) {
        System.out.println("Realizando depósito na conta " + this.numero);

        if (valor <= 0) System.out.println("Valor inválido para depósito\n");

        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        System.out.println("Novo saldo em " + this.numero + ": R$ " + this.saldo + "\n");
    }
}
