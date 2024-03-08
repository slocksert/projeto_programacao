package br.com.caelum.contas.modelo;

public class Conta {
    private static int totalDeContas;
    private static int proximoIdentificador = 1;
    private int identificador;
    private String nome = "Não informado";
    private int numero;
    private String agencia;
    private double saldo;
    private Data data;

    public Conta(String nome, int numero, String agencia, double saldo, Data data){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.identificador = proximoIdentificador++;
        this.data = data;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public Conta(int numero, String agencia, double saldo, Data data){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.identificador = proximoIdentificador++;
        this.data = data;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
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
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
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
                Data: %s
                """.formatted(identificador, nome, numero, agencia, saldo, data.dataFormatada());
    }
}

