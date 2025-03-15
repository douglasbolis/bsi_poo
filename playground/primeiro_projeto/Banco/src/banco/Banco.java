package banco;

public class Banco {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Douglas";
        p1.cpf = "012.345.678-90";
        p1.idade = 18;
        p1.sexo = 'm';

        Pessoa p2 = new Pessoa();
        p2.nome = "José";
        p2.cpf = "001.234.567-89";
        p2.idade = 18;
        p2.sexo = 'm';

        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.limite = 200;
        c1.saldo = 100;
        c1.titular = p1;

        Conta c2 = new Conta();
        c2.numero = "0123-4";
        c2.limite = 300;
        c2.saldo = 150;
        c2.titular = p2;

        c1.extrato();
        c2.extrato();
    }
}
