package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notificacoes")
@Data
@Introspected
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destinatario;
    private String mensagem;

    public void enviarEmail() {
        System.out.println("Simulando envio de e-mail para: " + destinatario);
        System.out.println("Conteúdo: " + mensagem);
    }
}