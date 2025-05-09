package rh;

import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner s = new Scanner(System.in);

        System.out.println("Dia:");
        this.dia = s.nextInt();

        System.out.println("Mês:");
        this.mes = s.nextInt();

        System.out.println("Ano:");
        this.ano = s.nextInt();
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public int compara(Data d2) {
        if (this.ano != d2.getAno()) {
            return this.ano > d2.getAno() ? 1 : -1;
        }
        if (this.mes != d2.getMes()) {
            return this.mes > d2.getMes() ? 1 : -1;
        }
        if (this.dia != d2.getDia()) {
            return this.dia > d2.getDia() ? 1 : -1;
        }

        return 0;
    }

    public String formato() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
