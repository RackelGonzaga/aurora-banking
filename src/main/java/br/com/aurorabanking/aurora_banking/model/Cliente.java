package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente os getters e os setters
import lombok.Setter;

/**
 * Representa um cliente cadastrado no Aurora Banking.
 * 
 * Um cliente pode possuir contas, cartões e outros produtos bancarios.
 */

@Getter 
@Setter 

public class Cliente {
    
    private String nome;
    private String cpf;
    private String email; 
    private String telefone;
    private Endereco endereco;

    /**
     *  Cria um novo cliente
     * 
     * @param nome nome completo do cliente
     * @param cpf CPF do cliente
     * @param email e-mail do cliente
     * @param telefone telefone do cliente
     * @param endereco endereço do cliente
     */

    public Cliente(String nome, String cpf, String email, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
 
}
