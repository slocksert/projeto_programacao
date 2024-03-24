package br.com.caelum.contas.modelo;

public class Conta {
    private static int totalDeContas;
    private static int proximoIdentificador = 1;
    private int identificador;
    private String titular = "Não informado";
    private int numero;
    private String agencia;
    protected double saldo;

    public Conta() {
        this.identificador = proximoIdentificador++;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }


    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String nome){
        this.titular = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getRendimento(){
        return saldo * 0.1;
    }
    public int getIdentificador() {return identificador;}
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
        return """
                ID: %d
                Nome: %s
                Numero %d
                Agencia: %s
                Saldo: %f
                """.formatted(identificador, titular, numero, agencia, saldo);
    }

    public	String	getTipo() {
            return "Conta";
    }

    public void transfere(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta de " + this.titular;
    }
}

