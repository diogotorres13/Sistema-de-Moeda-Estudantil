# 📘 Relatório de Análise Crítica do Projeto: Grupo 14

## 1. Informações do grupo
- **🎓 Curso:** Engenharia de Software
- **📘 Disciplina:** Laboratório de Desenvolvimento de Software
- **🗓 Período:** 4° Período
- **👨‍🏫 Professor(a):** Prof. Dr. João Paulo Carneiro Aramuni
- **👥 Membros do Grupo:** Samuel Jansem Carvalho Medeiros

---

## 📌 2. Identificação do Projeto
- **Nome do projeto:** Samuel Jansem Carvalho Medeiros
- **Pull requests submetidos pelo seu grupo:**

  | 👤 Integrante | 🔧 Refatoração | 🔗 Link do PR |
  |--------------|---------------|----------------|
  | Samuel Jansem Carvalho Medeiros | Extração de Service (SRP) | [link] |
  | Samuel Jansem Carvalho Medeiros | Tratamento Global de Exceções | [link] |
  | Samuel Jansem Carvalho Medeiros | Padronização de DTOs | [link] |

---

## 🧱 3. Arquitetura e Tecnologias
O projeto analisado segue o padrão MVC com Spring Boot. A persistência é gerenciada via Spring Data JPA. Observamos uma boa divisão de camadas, porém notamos que a camada de Visão (Thymeleaf) está acoplada diretamente a alguns controllers, dificultando a migração para uma API REST desacoplada no futuro.

---

## 🗂️ 4. Organização do GitHub
O repositório apresenta uma estrutura organizada, mas carece de um arquivo `CONTRIBUTING.md` e de uma estratégia clara de *branching*. Não foram identificadas *Issues* abertas, o que torna difícil rastrear a evolução das tarefas durante o desenvolvimento das Sprints.

---

## 🖥️ 5. Dificuldade para Configuração do Ambiente
A maior dificuldade foi a ausência de documentação sobre as variáveis de ambiente no `application.yml`. Não havia instruções sobre como configurar o banco de dados PostgreSQL.
* **Solução:** Foi necessário analisar o `Dockerfile` para identificar as variáveis esperadas e criar um arquivo `.env` local para que a aplicação subisse com sucesso.

---

## 🔎 6. Análise de Qualidade do Código e Testes
Identificamos a presença de *God Classes* (controllers que executam lógica de banco). Há uma carência de testes automatizados, especialmente na camada de serviço, o que aumenta o risco de regressão em novas funcionalidades.

---

## 🚀 7. Sugestões de Melhorias
1. **Documentação:** Criar um `README.md` detalhado com pré-requisitos de ambiente.
2. **SOLID:** Aplicar o Single Responsibility Principle nos Controllers.
3. **Segurança:** Implementar tratamento de exceções com `@ControllerAdvice`.
4. **Testes:** Adicionar testes unitários com JUnit 5 nos Services.
5. **CI/CD:** Configurar GitHub Actions para rodar o build automaticamente.

---

## 🔧 8. Refatorações Propostas

### 1️⃣ Refatoração 1 – Extração de Lógica de Negócio (Service Layer)
* **Arquivo:** `src/main/java/com/projeto/controller/VantagemController.java`
* **Justificativa:** O método de troca de vantagens estava validando saldo e salvando no banco dentro do Controller. Extraímos a lógica para `ResgateService`.

### 2️⃣ Refatoração 2 – Tratamento Global de Exceções
* **Arquivo:** `src/main/java/com/projeto/exception/GlobalExceptionHandler.java`
* **Justificativa:** O projeto usava `try-catch` repetitivos. Criamos um Handler centralizado para retornar status HTTP corretos (404, 400, 500).

### 3️⃣ Refatoração 3 – Uso de DTOs
* **Arquivo:** `src/main/java/com/projeto/dto/AlunoDTO.java`
* **Justificativa:** Estavam expondo a entidade JPA diretamente na View. A implementação de DTO protege a estrutura do banco de dados.

---

## 9. 📄 Conclusão
A análise crítica demonstrou que o projeto possui uma base sólida, mas sofre de problemas comuns de acoplamento entre camadas. As refatorações aplicadas tornaram o sistema mais testável e alinhado aos princípios de Engenharia de Software aprendidos na disciplina.
