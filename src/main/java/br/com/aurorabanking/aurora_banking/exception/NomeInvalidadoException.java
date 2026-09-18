package br.com.aurorabanking.aurora_banking.exception;

/**
 * Exceção lançada quando um nome inválido é fornecido.
 */

public class NomeInvalidadoException extends RuntimeException {
    public NomeInvalidadoException(String messagem) {
        super(messagem);
    }
    
}
