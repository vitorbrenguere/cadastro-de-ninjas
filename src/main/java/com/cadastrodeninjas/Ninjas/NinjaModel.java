package com.cadastrodeninjas.Ninjas;

import com.cadastrodeninjas.Missoes.MissoesModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity //@Entity transforma uma classe em uma ENTIDADE no banco de dados
@Table(name = "tb_cadastro") //@Table cria uma tabela com o respectivo (nome = "tb_boa_pratica")
@Data // Cria os Getters and Setters automaticamente com o Lombok
@NoArgsConstructor // Cria os Constructor vazio automaticamente com o Lombok
@AllArgsConstructor // Cria os Constructores automaticamente com o Lombok
public class NinjaModel {

    @Id

    @Column (unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(strategia de ID)
    private long id;

    @Column (name = "nome")
    private String nome;

    @Column (unique = true)
    private String email;

    private int idade;

    @Column (name = "img_url")
    private String imgUrl;

    @ManyToOne //relação do banco de dados ----- MUITOS ninjas pra UMA(mesma) missao
    @JoinColumn(name = "missoes_id") // chave estrangeira = Foreing Key FK (Banco de Dados Relacional SQL)
    private MissoesModel missoes;



}