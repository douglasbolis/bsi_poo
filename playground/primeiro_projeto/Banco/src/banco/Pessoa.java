package banco;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String cpf;
    Data dataNasc;
    char sexo;

    Pessoa() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.nome = s.nextLine();

        System.out.println("Digite o cpf: ");
        this.cpf = s.nextLine();

        System.out.println("Digite a data de nascimento: ");
        this.dataNasc = new Data();

        System.out.println("Digite o sexo: ");
        this.sexo = s.nextLine().charAt(0);
    }

    Pessoa (String nome, String cpf, char sexo, Data dtNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dtNasc;
        this.sexo = sexo;
    }

    void alteraCpf (String cpf) {
        this.cpf = cpf;
    }

    int consultaIdade(Data hoje) {
        int idade = hoje.ano - this.dataNasc.ano;

        // Ajusta a idade se o aniversário ainda não ocorreu neste ano
        if (hoje.mes < this.dataNasc.mes || (hoje.mes == this.dataNasc.mes && hoje.dia < this.dataNasc.dia)) {
            idade--;
        }

        return idade;
    }

}
