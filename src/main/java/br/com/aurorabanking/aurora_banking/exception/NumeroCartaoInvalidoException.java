package br.com.aurorabanking.aurora_banking.exception;

public class NumeroCartaoInvalidoException extends RuntimeException {
    public NumeroCartaoInvalidoException(String messagem) {
        super(messagem);
    }
}
