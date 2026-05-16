package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cupons")
@Data
@Introspected
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigoGerado;

    private boolean resgatado = false;

    @OneToOne(optional = false)
    @JoinColumn(name = "transacao_id")
    private Transacao transacao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vantagem_id")
    private Vantagem vantagem;
}