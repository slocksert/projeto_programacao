public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        setMes(mes);
        setDia(dia);
        this.ano = ano;
    }

    public void setDia(int dia) {
        switch (this.mes) {

            case 2 -> {
                if (dia <= 29){
                    this.dia = dia;
                }
                else {
                    throw new IllegalArgumentException("Fevereiro não pode ter mais de 29 dias");
                }
            }

            case 4, 6 , 9, 11-> {
                if (dia <= 30){
                    this.dia = dia;
                }
                else {
                    throw new IllegalArgumentException("Esse mês não pode ter mais de 30 dias.");
                }
            }

            default -> {
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                else{
                    throw new IllegalArgumentException("Dia inválido.");
                }
            }

        }
    }

    public void setMes(int mes){
        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        }
        else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

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
        return dia + "/" +  mes + "/" + ano;
    }
}
