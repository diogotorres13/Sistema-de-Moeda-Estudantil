package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vantagens")
@Data
@Introspected
public class Vantagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String fotoUrl;
    private int custoMoedas;

    @ManyToOne(optional = false)
    @JoinColumn(name = "empresa_id")
    private EmpresaParceira empresa;
}