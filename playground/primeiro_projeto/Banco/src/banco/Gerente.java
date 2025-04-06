package banco;

public class Gerente extends Pessoa {
    String mat, senha;
    Gerente(String nome, String cpf, char sexo, Data dtNasc, String mat, String senha) {
        super(nome, cpf, sexo, dtNasc);
        this.mat = mat;
        this.senha = senha;
    }

    boolean validarAcesso(String s) {
        return this.senha.equals(s);
    }
}
