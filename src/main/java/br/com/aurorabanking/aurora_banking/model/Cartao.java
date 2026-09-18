package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente o getters
import java.math.BigDecimal;

import br.com.aurorabanking.aurora_banking.exception.NomeInvalidadoException;
import br.com.aurorabanking.aurora_banking.exception.NumeroCartaoInvalidoException;

@Getter 

/**
 * Representa o cartão bancario associado a um cliente do Aurora Banking
 */

public abstract class Cartao {

    private String numero;
    private String nomeImpresso;
    private String validade;
    private String cvv;
    private BigDecimal limite;
    private Conta conta; 

    /**
     * @param numero número do cartão
     * @param nomeImpresso nome do cliente impresso no cartão
     * @param validade data de validade do cartão
     * @param cvv código de segurança do cartão
     * @param limite limite de crédito disponível no cartão
     * @param conta conta bancária á qual o cartão está associado
     */

    public Cartao(String numero, String nomeImpresso, String validade, String cvv, BigDecimal limite, Conta conta ) {
        this.numero = numero;
        this.nomeImpresso = nomeImpresso;
        this.validade = validade;
        this.cvv = cvv;
        this.limite = limite;
        this.conta = conta;
    }

    /**
     * Valida o número do cartão e o nome impresso no cartão.
     * 
     * @throws NumeroCartaoInvalidoException se o número do cartão for nulo, vazio ou não contiver exatamente 16 dígitos
     * @throws NomeInvalidadoException se o nome impresso no cartão for nulo, vazio ou contiver caracteres inválidos
     */

    private String validarNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new NumeroCartaoInvalidoException("O número do cartão não pode ser nulo ou vazio.");
        }
        if (!numero.matches("\\d{16}")) {
            throw new NumeroCartaoInvalidoException("O número do cartão deve conter exatamente 16 dígitos.");
        }
        return numero;
    }

    private String validarNomeImpresso(String nomeImpresso) {
        if (nomeImpresso == null || nomeImpresso.isBlank()) {
            throw new NomeInvalidadoException("O nome impresso no cartão não pode ser nulo ou vazio.");
        }
        if (!nomeImpresso.matches("[A-Za-z ]+")) {
            throw new NomeInvalidadoException("O nome impresso no cartão deve conter apenas letras e espaços.");
        }
        return nomeImpresso;

    }
    
}
