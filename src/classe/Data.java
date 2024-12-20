package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        dia = 4;
        mes = 8;
        ano = 1990;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void impriomirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
