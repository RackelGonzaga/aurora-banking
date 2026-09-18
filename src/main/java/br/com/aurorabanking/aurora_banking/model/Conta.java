package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente o getters

@Getter

/**
 * Representa a conta bancária de um cliente do Aurora Banking
 */

public abstract class Conta {

    private String numero;
    private double saldo;
    private Cliente titular;

    /**
     * @param numero número da conta
     * @param saldo saldo disponível na conta
     * @param titular cliente titular da conta
     */

    public Conta(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
    
}
