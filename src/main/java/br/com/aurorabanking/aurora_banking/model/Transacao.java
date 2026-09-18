package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente o getters

@Getter 

/**
 * Representa uma transação bancária realizada em uma conta do Aurora Banking
 */

public class Transacao {

    private String id;
    private double valor;
    private String data;
    private String descricao;
    private TipoTransacao tipo;
    private Conta conta;

    /**
     * @param id identificador único da transação
     * @param valor valor da transação
     * @param data data em que a transação foi realizada
     * @param descricao descrição da transação
     * @param tipo tipo da transação (ex: "DEPOSITO", "SAQUE", "TRANSFERENCIA", "PAGAMENTO", "COMPRA")
     * @param conta conta associada à transação
     */

    public Transacao(String id, double valor, String data, String descricao, TipoTransacao tipo, Conta conta) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.tipo = tipo;
        this.conta = conta;
    }
}