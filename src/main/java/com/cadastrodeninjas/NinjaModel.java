package com.cadastrodeninjas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //@Entity transforma uma classe em uma ENTIDADE no banco de dados
@Table(name = "tb_cadastro") //@Table cria uma tabela com o respectivo (nome = "tb_boa_pratica")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(strategia de ID)
    private long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
