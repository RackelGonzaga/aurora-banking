package br.com.aurorabanking.aurora_banking.model;

import lombok.Getter; // Lombok gera automaticamente os getters e os setters
import lombok.Setter;
import br.com.aurorabanking.aurora_banking.exception.NomeInvalidadoException;
import br.com.aurorabanking.aurora_banking.exception.CpfInvalidoException;
import br.com.aurorabanking.aurora_banking.exception.EmailInvalidoException;
import br.com.aurorabanking.aurora_banking.exception.TelefoneInvalidoException;

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

    /**
     * Atualiza o nome do cliente.
     * 
     * @param novoNome novo nome do cliente
     * @throws NomeInvalidadoException se o novo nome for nulo ou vazio
     * @param novoCPF novo CPF do cliente
     * @throws CpfInvalidoException se o novo CPF for nulo ou vazio 
     * @param novoEmail novo e-mail do cliente
     * @throws EmailInvalidoException se o novo e-mail for nulo ou vazio
     * @param novoTelefone novo telefone do cliente
     * @throws TelefoneInvalidoException se o novo telefone for nulo ou vazio
     */


    public void atualizarNome(String novoNome) {
        if (novoNome == null || novoNome.isBlank()) {
            throw new NomeInvalidadoException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = novoNome.trim();
    }

    public void atualizarCPF(String novoCPF) {
        if (novoCPF == null || novoCPF.isBlank()) {
            throw new CpfInvalidoException("O CPF não pode ser nulo ou vazio.");
        }
        this.cpf = novoCPF.trim();
    }

    public void atualizarEmail(String novoEmail) {
        if (novoEmail == null || novoEmail.isBlank()) {
            throw new EmailInvalidoException("O e-mail não pode ser nulo ou vazio.");
        }
        this.email = novoEmail.trim();
    }

    public void atualizarTelefone(String novoTelefone) {
        if (novoTelefone == null || novoTelefone.isBlank()) {
            throw new TelefoneInvalidoException("O telefone não pode ser nulo ou vazio.");
        }
        this.telefone = novoTelefone.trim();
    }
}