public class Conta {
    String nomeDoTitular;
    int numero;
    String agencia;
    double saldo;
    Data data;

    public void sacar(double valor){
        if(saldo >= valor && valor > 0){
            saldo -= valor;
        }
    }
    public double checarSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        if (valor >= 0){
           saldo += valor;
        }
    }
    public double calcularRendimento(){
        return saldo * 0.1;
    }
    public String recuperaDadosParaImpressao(){
        return "Nome: " + nomeDoTitular +
                "\n" + "Numero: " + numero +
                "\n" + "Agencia: " + agencia +
                "\n" + "Saldo: " + saldo +
                "\n" + "Data de abertura: " + data.dataFormatada();
    }
}
