package br.com.aurorabanking.aurora_banking.model;

public class ContaCorrente extends Conta {

    /***
     * Representa a conta corrente de um cliente do Aurora Banking
     * Esta classe herda da classe abstrata Conta, que contém os atributos e métodos comuns a todos os tipos de contas.
     */

    /**
     * @param numero número da conta
     * @param saldo saldo disponível na conta
     * @param titular cliente titular da conta
     */

    public ContaCorrente(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }
    
}