package br.com.model;

/**
 *
 * @author Conceicão Freitas
 */
public class Cliente {
    //atributos
    private String cpf;
    private String nome;
    private String celular;
    private String endereço;
    //construtores
    public Cliente(){
        
    }
    //construtor
    public Cliente(String cpf, String nome, String celular, String endereço) {
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.endereço = endereço;
    }
    //encapsulamento

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
        
    
     
    
}
