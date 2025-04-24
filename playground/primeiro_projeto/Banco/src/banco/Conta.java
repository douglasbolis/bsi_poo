package banco;

import java.util.Scanner;

public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data dtCriacao;
    protected Gerente gerente;

    public Conta(Gerente gerente) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número: ");
        this.setNumero(s.nextLine());

        System.out.println("Digite os dados do titular: ");
        this.setTitular(new Pessoa());

        this.setSaldo(0);

        System.out.println("Digite a data de criação da conta: ");
        this.setDtCriacao(new Data());

        this.setGerente(gerente);
    }

    public Conta (String numero, Pessoa titular, Gerente gerente, Data dtCriacao) {
        this.setNumero(numero);
        this.setTitular(titular);
        this.setGerente(gerente);
        this.setDtCriacao(dtCriacao);
        this.setSaldo(0);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Data dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double disponivel() {
        return this.getSaldo();
    }

    public void extrato() {
        System.out.println("Número: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular().getNome());
        System.out.println("Valor disponível para saque: " + this.disponivel() + "\n");
    }

    public void depositar(double valor) {
        System.out.println("Realizando depósito na conta " + this.getNumero());

        if (valor <= 0) System.out.println("Valor inválido para depósito\n");

        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        System.out.println("Novo saldo em " + this.getNumero() + ": R$ " + this.getSaldo() + "\n");
    }

    public boolean sacar(double valor) {
        System.out.println("Realizando saque na conta " + this.getNumero());

        if (this.disponivel() < valor) {
            System.out.println("Erro: não foi possível sacar R$ " + valor);
            System.out.println("Valor disponível para saque: R$ " + this.disponivel() + "\n");
            return false;
        }

        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        System.out.println("Novo saldo em " + this.getNumero() + ": R$ " + this.getSaldo() + "\n");
        return true;
    }

    public void transferir(double valor, Conta destino) {
        System.out.println("Realizando transferência");
        System.out.println("Origem: " + this.getNumero() + " - Destino: " + destino.getNumero());

        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso\n");
        } else {
            System.out.println("Erro: não foi possível transferir R$ " + valor);
            System.out.println("Valor disponível para transferência: R$ " + this.disponivel() + "\n");
        }
    }
}
