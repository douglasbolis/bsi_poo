package banco;

import java.util.Scanner;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data dtCriacao;
    Gerente gerente;

    Conta(Gerente gerente) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número: ");
        this.numero = s.nextLine();

        System.out.println("Digite os dados do titular: ");
        this.titular = new Pessoa();

        this.saldo = 0;

        System.out.println("Digite a data de criação da conta: ");
        this.dtCriacao = new Data();

        this.gerente = gerente;
    }

    Conta (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        this.numero = numero;
        this.titular = titular;
        this.gerente = gerente;
        this.dtCriacao = dtCriacao;
        this.saldo = 0;
    }

    double disponivel() {
        return this.saldo;
    }

    void extrato() {
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    void depositar(double valor) {
        System.out.println("Realizando depósito na conta " + this.numero);

        if (valor <= 0) System.out.println("Valor inválido para depósito\n");

        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        System.out.println("Novo saldo em " + this.numero + ": R$ " + this.saldo + "\n");
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
}
