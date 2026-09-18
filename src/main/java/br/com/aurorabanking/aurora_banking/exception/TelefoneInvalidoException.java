package br.com.aurorabanking.aurora_banking.exception;

/**
 * Exceção lançada quando um telefone inválido é fornecido.
 */

public class TelefoneInvalidoException extends RuntimeException {
    public TelefoneInvalidoException(String messagem) {
        super(messagem);
    }
}
