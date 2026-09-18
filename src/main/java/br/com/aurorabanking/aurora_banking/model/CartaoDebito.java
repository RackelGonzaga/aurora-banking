package br.com.aurorabanking.aurora_banking.model;

public class CartaoDebito extends Cartao {

    /***
     * Representa o cartão de débito associado a um cliente do Aurora Banking
     * Esta classe herda da classe abstrata Cartao, que contém os atributos e métodos comuns a todos os tipos de cartões.
     */
   
    /**
     * Cria um novo cartão de débito com os atributos fornecidos.
     * @param numero número do cartão
     * @param nomeImpresso nome do cliente impresso no cartão
     * @param validade data de validade do cartão
     * @param cvv código de segurança do cartão
     * @param limite limite de crédito disponível no cartão
     * @param conta conta bancária á qual o cartão está associado
     */

    public CartaoDebito(String numero, String nomeImpresso, String validade, String cvv, double limite, Conta conta) {
        super(numero, nomeImpresso, validade, cvv, limite, conta);
    }
    
}