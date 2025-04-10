package banco;

import java.util.Scanner;

public class Data {
    int dia, mes, ano;

    Data() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        this.dia = s.nextInt();

        System.out.println("Digite o mês: ");
        this.dia = s.nextInt();

        System.out.println("Digite o ano: ");
        this.dia = s.nextInt();
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimir() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    String formato() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    boolean maior(Data d2) {
        if (this.ano != d2.ano) {
            return this.ano > d2.ano;
        }
        if (this.mes != d2.mes) {
            return this.mes > d2.mes;
        }
        return this.dia > d2.dia;
    }
}
