package rh;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private Data dtNasc;
    private Data dtContr;

    public Funcionario() {
        Scanner s = new Scanner(System.in);

        System.out.println("Nome:");
        this.nome = s.nextLine();

        System.out.println("Cpf:");
        this.cpf = s.nextLine();;

        System.out.println("Salário:");
        this.salario = s.nextDouble();

        System.out.println("Data de nascimento:");
        this.dtNasc = new Data();

        System.out.println("Data de contratação:");
        this.dtContr = new Data();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public Data getDtContr() {
        return dtContr;
    }

    public void listarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Data de nascimento: " + this.dtNasc.formato());
        System.out.println("Data de contratação: " + this.dtContr.formato());
    }
}
