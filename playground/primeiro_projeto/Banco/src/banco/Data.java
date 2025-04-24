package banco;

import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        this.setDia(s.nextInt());

        System.out.println("Digite o mês: ");
        this.setDia(s.nextInt());

        System.out.println("Digite o ano: ");
        this.setDia(s.nextInt());
    }

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String formato() {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }

    public void imprimir() {
        System.out.println(this.formato());
    }

    public boolean maior(Data d2) {
        if (this.getAno() != d2.getAno()) {
            return this.getAno() > d2.getAno();
        }
        if (this.getMes() != d2.getMes()) {
            return this.getMes() > d2.getMes();
        }
        return this.getDia() > d2.getDia();
    }
}
