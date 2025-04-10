package banco;

import java.util.Scanner;

public class Gerente extends Pessoa {
    String mat, senha;

    Gerente() {
        super();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a matrícula: ");
        this.mat = s.nextLine();

        System.out.println("Digite a senha: ");
        this.senha = s.nextLine();
    }

    Gerente(String nome, String cpf, char sexo, Data dtNasc, String mat, String senha) {
        super(nome, cpf, sexo, dtNasc);
        this.mat = mat;
        this.senha = senha;
    }

    boolean validarAcesso(String s) {
        return this.senha.equals(s);
    }

    boolean validarAcesso() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        String pwd = s.nextLine();

        return this.validarAcesso(pwd);
    }
}
