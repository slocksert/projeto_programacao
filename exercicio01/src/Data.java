public class Data {
    int dia;
    int mes;
    int ano;

    public String dataFormatada(){
        if (dia < 10 && mes < 10) {
            String diaString = "0" + dia;
            String mesString = "0" + mes;
            return diaString + "/" + mesString + "/" + ano;
        }

        else if (dia < 10) {
            String diaString = "0" + dia;
            return diaString + "/" + mes + "/" + ano;
        }
        else if (mes < 10){
            String mesString = "0" + mes;
            return dia + "/" + mesString + "/" + ano;
        }
        return null;
    }
}
