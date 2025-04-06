package banco;

public class Banco {
    public static void main(String[] args) {
        // Pessoas
        Pessoa p1 = new Pessoa("Douglas", "012.345.678-90", 'm',new Data(30, 1, 2000));
        Pessoa p2 = new Pessoa("José", "001.234.567-89", 'm', new Data(31, 5, 1962));

        // Gerentes
        Gerente g1 = new Gerente("Maria", "001.234.567-89", 'f', new Data(31, 3, 1980), "987654", "asd123");

        // Datas
        Data hoje = new Data(6, 4, 2025);
        p1.dataNasc.imprimir();
        System.out.println("A idade de " + p1.nome + " é " + p1.consultaIdade(hoje));

        Data d1 = new Data(27, 1, 2020);
        Data d2 = new Data(3, 2, 2025);
        Data d3 = new Data(6, 4, 2025);
        Data d4 = new Data(15, 9, 2025);
        Data d5 = new Data(5, 5, 2030);
        System.out.println(hoje.formato() + " é maior do que " + d1.formato() + "? " + hoje.maior(d1));
        System.out.println(hoje.formato() + " é maior do que " + d2.formato() + "? " + hoje.maior(d2));
        System.out.println(hoje.formato() + " é maior do que " + d3.formato() + "? " + hoje.maior(d3));
        System.out.println(hoje.formato() + " é maior do que " + d4.formato() + "? " + hoje.maior(d4));
        System.out.println(hoje.formato() + " é maior do que " + d5.formato() + "? " + hoje.maior(d5));

        // Contas
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, g1, new Data(1, 1, 2000));
        Poupanca c2 = new Poupanca("0123-4", p2, g1, new Data(31, 2, 1999));

        c1.extrato();
        c2.extrato();

        c1.sacar(100);
        c1.transferir(150, c2);
        c1.sacar(10);
        c1.depositar(100);
        c1.transferir(15, c2);
        c2.sacar(10);
        c2.transferir(5, c1);
        c2.depositar(50);

        // Cheque especial e rendimento
        System.out.println("\nCheque especial aplicado na conta corrente " + c1.numero);
        for (int i = 1; i <= 30; i++) {
            c1.chequeEspecial(0.5);
            System.out.println("Saldo após " + i + " dia(s): R$ " + c1.saldo);
        }

        System.out.println("\nRendimento aplicado na conta poupança " + c2.numero);
        for (int i = 1; i <= 30; i++) {
            c2.rendimento(0.5);
            System.out.println("Saldo após " + i + " dia(s): R$ " + c2.saldo);
        }
    }
}
