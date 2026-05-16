package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "instituicoes")
@Data
@Introspected
public class Instituicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}