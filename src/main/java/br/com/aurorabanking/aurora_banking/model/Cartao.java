package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente o getters

@Getter 

/**
 * Representa o cartão bancario associado a um cliente do Aurora Banking
 */

public abstract class Cartao {

    private String numero;
    private String nomeImpresso;
    private String validade;
    private String cvv;
    private double limite;
    private Conta conta; 

    /**
     * @param numero número do cartão
     * @param nomeImpresso nome do cliente impresso no cartão
     * @param validade data de validade do cartão
     * @param cvv código de segurança do cartão
     * @param limite limite de crédito disponível no cartão
     * @param conta conta bancária á qual o cartão está associado
     */

    public Cartao(String numero, String nomeImpresso, String validade, String cvv, double limite, Conta conta ) {
        this.numero = numero;
        this.nomeImpresso = nomeImpresso;
        this.validade = validade;
        this.cvv = cvv;
        this.limite = limite;
        this.conta = conta;
    }
    
}
