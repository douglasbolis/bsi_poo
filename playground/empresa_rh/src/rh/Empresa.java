package rh;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Gerente> gerentes;
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        this.gerentes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    private Funcionario localizarFuncionario(String cpf) {
        for(Funcionario f : this.funcionarios) {
            if (cpf.equals(f.getCpf())) {
                return f;
            }
        }

        return null;
    }

    private Gerente localizarGerente(String cpf) {
        for(Gerente g : this.gerentes) {
            if (cpf.equals(g.getCpf())) {
                return g;
            }
        }

        return null;
    }

    public void folhaPagamento() {
        double soma = 0;
        
        for(Funcionario f : this.funcionarios) {
            f.listarDados();
            soma += f.getSalario();
        }
        for(Gerente g : this.gerentes) {
            g.listarDados();
            soma += g.getSalario();
            System.out.println("Custo total da equipe: R$ " + g.custoEquipe());
        }

        System.out.println("Custo mensal da empresa: R$ " + soma);
    }

    public void contratarFuncionario() {
        Funcionario f = new Funcionario();
        this.funcionarios.add(f);
    }

    public void contratarGerente() {
        Gerente g = new Gerente();
        this.gerentes.add(g);
    }

    public Funcionario funcionarioMaisAntigo() {
        Funcionario f = this.funcionarios.get(0);

        for(Funcionario f2 : this.funcionarios) {
            if (f.getDtContr().compara(f2.getDtContr()) < 0)    {
                f = f2;
            }
        }

        return f;
    }

    public Funcionario funcionarioMaisVelho() {
        Funcionario f = this.funcionarios.get(0);

        for(Funcionario f2 : this.funcionarios) {
            if (f.getDtNasc().compara(f2.getDtNasc()) < 0) {
                f = f2;
            }
        }

        return f;
    }

    private void atribuirFuncGer(String cpf1, String cpf2) {
        Gerente g = this.localizarGerente(cpf2);
        Funcionario f = this.localizarFuncionario(cpf1);

        if (g != null && f != null) {
            g.inserirFuncEquipe(f);
            System.out.println("Funcionário inserido na equipe com sucesso.");
        } else {
            System.out.println("Problema ao atribuir o funcionário à equipe do genrente.");
            System.out.println("Gerente ou funcionário não encontrados.");
        }
    }
}
