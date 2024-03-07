public class Main {
    public static void main(String[] args)
    {
        Conta c1 = new Conta();
        c1.data = new Data();
        c1.data.dia = 1;
        c1.data.mes = 12;
        c1.data.ano = 2023;

        System.out.println(c1.recuperaDadosParaImpressao());
    }
    }