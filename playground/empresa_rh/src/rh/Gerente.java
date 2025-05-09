package rh;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario {
    private String senha;
    private ArrayList<Funcionario> equipe;

    public Gerente() {
        super();

        Scanner s = new Scanner(System.in);

        System.out.println("Senha:");
        this.senha = s.nextLine();

        this.equipe = new ArrayList<>();
    }

    public boolean validarAcesso() {
        Scanner s = new Scanner(System.in);

        System.out.println("Senha:");
        String senha = s.nextLine();

        return senha.equals(this.senha);
    }

    public void alterarSenha() {
        Scanner s = new Scanner(System.in);

        System.out.println("Senha anterior:");
        String senha = s.nextLine();

        if (!senha.equals(this.senha)) {
            System.out.println("Senha inválida.");
        } else {
            System.out.println("Nova senha:");
            this.senha = s.nextLine();
            System.out.println("Senha alterada.");
        }
    }

    public void listarDados() {
        System.out.println("Gerente:");
        super.listarDados();
    }

    public double custoEquipe() {
        double soma = this.getSalario();

        for(Funcionario f : this.equipe) {
            soma += f.getSalario();
        }

        return soma;
    }

    public void listarEquipe() {
        this.listarDados();

        for(Funcionario f : this.equipe) {
            f.listarDados();
        }
    }

    public void inserirFuncEquipe(Funcionario f) {
        if (f != null) {
            this.equipe.add(f);
            System.out.println("Funcionário inserido.");
        } else {
            System.out.println("Funcionário não inserido.");
        }
    }
}
