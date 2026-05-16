package br.pucminas.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "empresas_parceiras")
@PrimaryKeyJoinColumn(name = "usuario_id")
@Data
@EqualsAndHashCode(callSuper = true)
@Introspected
public class EmpresaParceira extends Usuario {

    private String nome;
    private String cnpj;

    // Composição forte exigida na modelagem
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}