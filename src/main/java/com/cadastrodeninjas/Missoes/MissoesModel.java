package com.cadastrodeninjas.Missoes;

import com.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;

    //@OneToMany relação do banco de dados ----- UMA missao pra VARIOS ninjas
    @OneToMany (mappedBy = "missoes") //mappedBy = chave estrangeira FK (Banco de Dados relacional)
    private List<NinjaModel> ninja;



}
