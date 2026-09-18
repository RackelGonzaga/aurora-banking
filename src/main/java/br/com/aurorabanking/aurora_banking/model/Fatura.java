package br.com.aurorabanking.aurora_banking.model;

import java.util.List;
import lombok.Getter;

@Getter 

public class Fatura {

    private String id;
    private double valorTotal;
    private String dataFechamento;
    private String dataVencimento;
    private boolean paga;
    private CartaoCredito cartao;
    private List <Transacao> transacoes;

    public Fatura(String id, double valorTotal, String dataFechamento, String dataVencimento, boolean paga, CartaoCredito cartao, List<Transacao> transacoes) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.dataFechamento = dataFechamento;
        this.dataVencimento = dataVencimento;
        this.paga = paga;
        this.cartao = cartao;
        this.transacoes = transacoes;
    }
}