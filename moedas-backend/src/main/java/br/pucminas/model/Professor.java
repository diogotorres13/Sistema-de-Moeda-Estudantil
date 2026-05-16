package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "professores")
@PrimaryKeyJoinColumn(name = "usuario_id")
@Data
@EqualsAndHashCode(callSuper = true)
@Introspected
public class Professor extends Usuario {

    private String nome;
    
    @Column(unique = true, nullable = false)
    private String cpf;
    
    private int saldoMoedas = 1000; // Começa com as mil semestrais [cite: 15]

    @ManyToOne(optional = false)
    @JoinColumn(name = "instituicao_id")
    private Instituicao instituicao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
}