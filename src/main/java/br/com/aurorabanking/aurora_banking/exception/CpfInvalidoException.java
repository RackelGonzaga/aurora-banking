package br.com.aurorabanking.aurora_banking.exception;

/**
 * Exceção lançada quando um CPF inválido é fornecido.
 */

public class CpfInvalidoException extends RuntimeException {
    public CpfInvalidoException(String messagem) {
        super(messagem);
    }
}