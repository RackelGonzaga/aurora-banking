package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // lombok gera os getters e setters automaticamente, evitando a necessidade de escrever manualmente

@Getter 

/**
 * Representa o empréstimo bancário associado a um cliente do Aurora Banking
 */

public class Emprestimo {

    private String id;
    private double valorSolicitado;
    private double valorTotal;
    private double taxaJuros;
    private int quantidadeParcelas;
    private double valorParcela;
    private String dataContratacao;
    private String dataVencimento;
    private String status;
    private Cliente cliente;

    /**
     * @param id identificador único do empréstimo
     * @param valorSolicitado valor solicitado pelo cliente
     * @param valorTotal valor total a ser pago pelo cliente, incluindo juros
     * @param taxaJuros taxa de juros aplicada ao empréstimo
     * @param quantidadeParcelas número de parcelas em que o empréstimo será pago
     * @param valorParcela valor de cada parcela do empréstimo
     * @param dataContratacao data em que o empréstimo foi contratado
     * @param dataVencimento data de vencimento da última parcela do empréstimo
     * @param status status atual do empréstimo (ex: "ativo", "quitado", "em atraso")
     * @param cliente cliente associado ao empréstimo
     */

    public Emprestimo(String id, double valorSolicitado, double valorTotal, double taxaJuros, int quantidadeParcelas, double valorParcela, String dataContratacao, String dataVencimento, String status, Cliente cliente) {
        this.id = id;
        this.valorSolicitado = valorSolicitado;
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.quantidadeParcelas = quantidadeParcelas;
        this.valorParcela = valorParcela;
        this.dataContratacao = dataContratacao;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.cliente = cliente;
    }
    
}
