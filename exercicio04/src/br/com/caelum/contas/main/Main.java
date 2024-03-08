package br.com.caelum.contas.main;

import br.com.caelum.contas.data.Data;
import br.com.caelum.contas.modelo.Conta;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(27,11,2002);
        Data data2 = new Data(13,2,2023);
        Data data3 = new Data(1,7,2019);

        Conta c1 = new Conta(1111,"0001",842.4, data1);
        Conta c2 = new Conta("Rildo", 1111, "0001", 920, data2);
        Conta c3 = new Conta("Maria", 2323, "0001", 2000, data3);

        c1.depositar(820);
        System.out.println(c1.recuperaDadosParaImpressao());

        c2.sacar(200);
        System.out.println(c2.recuperaDadosParaImpressao());
        System.out.println(c3.recuperaDadosParaImpressao());

        System.out.println("Total de contas: " + Conta.getTotalDeContas());

    }
}