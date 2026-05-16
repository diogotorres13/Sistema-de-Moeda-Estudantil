package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
@Data
@Introspected
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int valor;
    private String motivo; // Mensagem obrigatória [cite: 17]
    private LocalDateTime dataTransacao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor; // Nulo se for um resgate de vantagem

    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}