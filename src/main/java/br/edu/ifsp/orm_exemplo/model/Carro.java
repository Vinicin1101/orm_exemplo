package br.edu.ifsp.orm_exemplo.model;

import javax.persistence.*;

// Classe no padrão POJO

@Entity // -> Especificando a tabela
public class Carro {

    // Especificando a chave e o tipo de geração
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cor;

    // Construtor
    public Carro() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
