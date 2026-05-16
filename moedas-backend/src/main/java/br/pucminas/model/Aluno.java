package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "alunos")
@PrimaryKeyJoinColumn(name = "usuario_id")
@Data
@EqualsAndHashCode(callSuper = true)
@Introspected
public class Aluno extends Usuario {

    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String curso;
    private int saldoMoedas;

    // Composição forte exigida na modelagem
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    // Adicione isso dentro da sua classe Aluno.java para mapear a Instituição pré-cadastrada
    @ManyToOne(optional = false)
    @JoinColumn(name = "instituicao_id")
    private Instituicao instituicao;
}