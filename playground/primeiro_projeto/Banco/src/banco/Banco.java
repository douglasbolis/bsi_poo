package banco;

public class Banco {
    public static void main(String[] args) {
        // Pessoas
        Pessoa p1 = new Pessoa("Douglas", "012.345.678-90", 'm',new Data(30, 1, 2000));
        Pessoa p2 = new Pessoa("José", "001.234.567-89", 'm', new Data(31, 5, 1962));

        // Gerentes
        Gerente g1 = new Gerente("Maria", "001.234.567-89", 'f', new Data(31, 3, 1980), "987654", "asd123");

        // // Datas
        // Data hoje = new Data(27, 3, 2025);
        // p1.dataNasc.imprimir();
        // System.out.println("A idade de " + p1.nome + " é " + p1.consultaIdade(hoje));
        // p2.dataNasc.imprimir();
        // System.out.println("A idade de " + p2.nome + " é " + p2.consultaIdade(hoje));
        // g1.dataNasc.imprimir();
        // System.out.println("A idade de " + g1.nome + " é " + g1.consultaIdade(hoje));

        // Contas correntes
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, g1, new Data(1, 1, 2000));
        ContaCorrente c2 = new ContaCorrente("0123-4", p2, g1, new Data(31, 2, 1999), 0);

        c1.extrato();
        c2.extrato();

        c1.sacar(100);
        c1.transferir(150, c2);
        c1.sacar(100);
        c1.depositar(100);
        c1.transferir(150, c2);

        for (int i = 1; i <= 30; i++) {
            c1.chequeEspecial(0.5);
            System.out.println("Saldo após " + i + " dia(s): R$ " + c1.saldo);
        }
    }
}
