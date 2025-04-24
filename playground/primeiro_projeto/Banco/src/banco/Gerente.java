package banco;

import java.util.Scanner;

public class Gerente extends Pessoa {
    private String mat;
    private String senha;

    public Gerente() {
        super();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a matrícula: ");
        this.mat = s.nextLine();

        System.out.println("Digite a senha: ");
        this.senha = s.nextLine();
    }

    public Gerente(String nome, String cpf, char sexo, Data dtNasc, String mat, String senha) {
        super(nome, cpf, sexo, dtNasc);
        this.mat = mat;
        this.senha = senha;
    }

    public String getMat() {
        return mat;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaAnterior, String senha) {
        if(this.validarAcesso(senhaAnterior)) {
            this.senha = senha;
        }

        System.out.println("Senha incorreta");
    }

    public boolean validarAcesso(String s) {
        return this.getSenha().equals(s);
    }

    public boolean validarAcesso() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        String pwd = s.nextLine();

        return this.validarAcesso(pwd);
    }
}
