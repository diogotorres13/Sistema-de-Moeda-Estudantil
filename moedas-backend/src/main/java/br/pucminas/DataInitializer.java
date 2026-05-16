package br.pucminas;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import java.util.Map;
import java.util.HashMap;

@Singleton
public class DataInitializer {

    // Se você já tiver os repositórios de Professor e Instituição criados, injete-os aqui.
    // Caso contrário, vamos usar o Entity Manager nativo para salvar rápido sem travar o build.
    @jakarta.persistence.PersistenceContext
    private jakarta.persistence.EntityManager entityManager;

    @EventListener
    @Transactional
    public void onStartup(StartupEvent event) {
        System.out.println("Iniciando pré-cadastro de Instituições e Professores...");

        // 1. Pré-cadastro de Instituições de Ensino
        String queryCheck = "SELECT count(i) FROM Instituicao i";
        // Evita duplicar se o banco persistir por algum motivo
        try {
            // Criando Instituição fictícia para o vínculo
            Object instituicao = Class.forName("br.pucminas.model.Instituicao").getDeclaredConstructor().newInstance();
            // Preencha os sets/campos se houver de acordo com seu modelo, ou use SQL Nativo para garantir:
            
            entityManager.createNativeQuery("INSERT INTO instituicoes (id, nome) VALUES (1, 'PUC Minas - Coração Eucarístico')").executeUpdate();
            entityManager.createNativeQuery("INSERT INTO instituicoes (id, nome) VALUES (2, 'PUC Minas - Praça da Liberdade')").executeUpdate();
            
            // 2. Pré-cadastro de Professores (Nome, CPF, Departamento, Instituição e dados de Usuário)
            // Vinculados à Instituição 1 (PUC Minas)
            entityManager.createNativeQuery(
                "INSERT INTO usuarios (id, login, senha, tipo) VALUES (999, 'joao.paulo', '123456', 'PROFESSOR')"
            ).executeUpdate();
            
            entityManager.createNativeQuery(
                "INSERT INTO professores (usuario_id, nome, cpf, departamento, instituicao_id, saldo_moedas) " +
                "VALUES (999, 'João Paulo', '123.456.789-00', 'Departamento de Computação', 1, 1000.0)"
            ).executeUpdate();

            System.out.println("Pré-cadastro realizado com sucesso! Login do professor: joao.paulo / 123456");
        } catch (Exception e) {
            System.out.println("Aviso: Tabelas ainda não mapeadas ou dados já inseridos. Pulando inicialização automatizada.");
        }
    }
}