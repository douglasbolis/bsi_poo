package banco;

public class Data {
    int dia, mes, ano;

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
