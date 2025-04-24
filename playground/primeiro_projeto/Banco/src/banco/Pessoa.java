package banco;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private Data dataNasc;
    private char sexo;

    public Pessoa() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.setNome(s.nextLine());

        System.out.println("Digite o cpf: ");
        this.setCpf(s.nextLine());

        System.out.println("Digite a data de nascimento: ");
        this.setDataNasc(new Data());

        System.out.println("Digite o sexo: ");
        this.setSexo(s.nextLine().charAt(0));
    }

    public Pessoa (String nome, String cpf, char sexo, Data dtNasc) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNasc(dtNasc);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void alteraCpf (String cpf) {
        this.setCpf(cpf);
    }

    public int consultaIdade(Data hoje) {
        int idade = hoje.getAno() - this.getDataNasc().getAno();

        // Ajusta a idade se o aniversário ainda não ocorreu neste ano
        if (hoje.getMes() < this.getDataNasc().getMes() || (hoje.getMes() == this.getDataNasc().getMes() && hoje.getDia() < this.getDataNasc().getDia())) {
            idade--;
        }

        return idade;
    }
}
