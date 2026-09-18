package br.com.aurorabanking.aurora_banking.exception;

/**
 * Exceção lançada quando um email inválido é fornecido.
 */

public class EmailInvalidoException extends RuntimeException {
    public EmailInvalidoException(String messagem) {
        super(messagem);
    }
}