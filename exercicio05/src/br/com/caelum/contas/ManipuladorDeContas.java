package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

import java.util.Objects;

public class ManipuladorDeContas	{
    private	Conta conta;

    public	void	criaConta(Evento	evento) {
        String	tipo	=	evento.getSelecionadoNoRadio("tipo");
        System.out.println(tipo);
        if	(Objects.equals(tipo, "Conta Corrente")){	{
            this.conta	=	new	ContaCorrente();
        }
        }	else 	{
            this.conta	=	new	ContaPoupanca();
        }
        this.conta.setTitular(evento.getString("titular"));
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));

    }

    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.depositar(valorDigitado);
    }

    public	void	saca(Evento	evento) {
        double	valor	=	evento.getDouble("valorOperacao");
        this.conta.sacar(valor);
    }

    public	void	transfere(Evento	evento) {
        Conta	destino	=	(Conta)	evento.getSelecionadoNoCombo("destino");
        conta.transfere(evento.getDouble("valorTransferencia"),	destino);
    }

}