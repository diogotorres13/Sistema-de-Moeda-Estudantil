<a href="https://classroom.github.com/online_ide?assignment_repo_id=99999999&assignment_repo_type=AssignmentRepo"><img src="https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg" width="200"/></a> <a href="https://classroom.github.com/open-in-codespaces?assignment_repo_id=99999999"><img src="https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg" width="250"/></a>

---

# Meritus — Sistema de Reconhecimento e Gamificação Acadêmica 👨‍💻

> [!NOTE]
> Transformando o engajamento estudantil e o mérito acadêmico em vantagens reais através de uma plataforma integrada de moedas virtuais.

<table>
  <tr>
    <td width="800px">
      <div align="justify">
        O <b>MeritCoin</b> é um ecossistema digital desenvolvido para aproximar professores, alunos e o ecossistema corporativo parceiro através da gamificação e meritocracia. Na plataforma, os professores docentes recebem lotes semestrais de moedas institucionais para premiar alunos que se destacam em laboratórios práticos, projetos de extensão, monitorias e comportamento exemplar. Com as moedas acumuladas em sua carteira digital, os estudantes podem acessar uma vitrine e resgatar vantagens reais fornecidas por empresas parceiras cadastradas, promovendo um ciclo virtuoso de incentivo técnico, engajamento e conexão direta com o mercado de trabalho.
      </div>
    </td>
    <td>
      <div align="center">
        <span style="font-size: 70px;">🪙</span>
      </div>
    </td>
  </tr> 
</table>

---

## 🚧 Status do Projeto

### Badges de Desenvolvimento:

[![Versão](https://img.shields.io/badge/Versão-v1.0.0-blue?style=for-the-badge)](https://github.com/joaopauloaramuni/laboratorio-de-desenvolvimento-de-software/releases) ![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-3.9.9-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.5-007ec6?style=for-the-badge&logo=springboot&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) ![Bootstrap 5](https://img.shields.io/badge/Bootstrap-5.3.0-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white) ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black) ![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

---

## 📚 Índice
- [Links Úteis](#-links-úteis)
- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades Principais](#-funcionalidades-principais)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura](#-arquitetura)
- [Instalação e Execução](#-instalação-e-execução)
  - [Pré-requisitos](#pré-requisitos)
  - [Variáveis de Ambiente](#-variáveis-de-ambiente)
  - [Instalação de Dependências](#-instalação-de-dependências)
  - [Inicialização do Banco de Dados (PostgreSQL)](#-inicialização-do-banco-de-dados-postgresql)
  - [Como Executar a Aplicação](#-como-executar-a-aplicação)
- [Deploy](#-deploy)
- [Estrutura de Pastas](#-estrutura-de-pastas)
- [Demonstração](#-demonstração)
- [Autores](#-autores)
- [Licença](#-licença)

---

## 🔗 Links Úteis
* 🌐 **Demo Online:** [Acesse a Aplicação Web](http://localhost:8080/index.html)
  > 💻 **Descrição:** Acesso à página inicial de autenticação e portais dos perfis locais do sistema.
* 📖 **Documentação da API:** [Swagger UI Endpoint](http://localhost:8080/swagger-ui.html)
  > 📚 **Descrição:** Especificação técnica e mapa completo de rotas e controllers REST do ecossistema MeritCoin.

---

## 📝 Sobre o Projeto
O projeto nasceu no contexto do Laboratório de Desenvolvimento de Software com o intuito de resolver o desafio prático de **estimular e rastrear o engajamento acadêmico de forma transparente**. 

Muitas vezes, contribuições valiosas de alunos (auxílio a colegas, dedicação extra em projetos práticos, participação ativa) não são formalmente reconhecidas ou consolidadas. O MeritCoin digitaliza e simplifica este processo:
- **Motivação:** Criar uma mecânica transparente e divertida de ganho e troca de pontos (moedas).
- **Problema resolvido:** Falta de incentivos práticos imediatos para o desempenho acadêmico e a ausência de um canal unificado entre empresas em busca de talentos e alunos de alto desempenho.
- **Contexto:** Projeto acadêmico focado em engenharia de software robusta, arquitetura MVC bem estruturada e simulações ricas em persistência de dados.

---

## ✨ Funcionalidades Principais

- 🔐 **Autenticação e Multiperfil:** Portais exclusivos baseados no tipo de conta (Aluno Estudante, Professor Docente ou Empresa Parceira).
- 🎓 **Portal do Aluno:** - Visualização de saldo atualizado em tempo real com alta legibilidade.
  - Extrato detalhado de moedas recebidas (contendo o nome do professor remetente e a respectiva justificativa acadêmica).
  - **Histórico Completo de Vantagens Resgatadas**, exibindo o item adquirido, custo em moedas deduzido e a empresa parceira fornecedora.
  - Vitrine interativa para troca imediata de moedas por benefícios.
- 👨‍🏫 **Portal do Professor:** - Monitoramento do saldo disponível no lote semestral instituído pela faculdade.
  - Formulário dinâmico para seleção de estudantes e envio assistido de moedas com justificativa obrigatória.
- 🏢 **Portal da Empresa:** - Criação rápida de vantagens e benefícios informando título, descrição das regras de uso e o custo estipulado em moedas.
  - Painel/Vitrine de controle dos itens publicados e ativos no marketplace acadêmico.

---

## 🛠 Tecnologias Utilizadas

### 💻 Front-end (Camada de Visão)
* **Estrutura Base:** HTML5 Nativo e JavaScript assíncrono para manipulação local/API.
* **Estilização e Responsividade:** Bootstrap 5.3 (Modificado sob regras de alto contraste para o Tema Escuro/Preto).
* **Biblioteca de Ícones:** Font Awesome 6.4.

### 🖥️ Back-end e Persistência
* **Linguagem/Runtime:** Java 17 (JDK)
* **Framework:** Spring Boot 3.x
* **Gerenciador de Dependências:** Maven 3.9+
* **Banco de Dados:** PostgreSQL 16
* **ORM:** Spring Data JPA / Hibernate

### ⚙️ Infraestrutura & DevOps
* **Containerização:** Docker e Docker Compose para unificação de ambiente.

---

## 🏗 Arquitetura

O sistema é construído sobre o padrão arquitetural **MVC (Model-View-Controller)**, onde as responsabilidades de negócio e renderização são desacopladas de forma limpa:
- **Model:** Entidades mapeadas via JPA que representam Alunos, Professores, Empresas, Transações e Vantagens.
- **View:** Páginas estáticas otimizadas integradas na pasta de recursos públicos, consumindo a API assincronamente.
- **Controller:** Endpoints REST que gerenciam a validação de regras de saldo, envio de moedas, fluxos de auditoria e cadastro.

---

## 🔧 Instalação e Execução

### Pré-requisitos
Certifique-se de ter os seguintes softwares instalados em sua máquina:
* **Java JDK 17** ou superior instalado e configurado nas variáveis globais (`JAVA_HOME`).
* **Maven** para o gerenciamento e compilação do projeto Back-end.
* **Docker Desktop** ativo para a subida instantânea do banco de dados relacional.

---

### 🔑 Variáveis de Ambiente

O arquivo de configuração do Spring está mapeado para buscar as seguintes credenciais cruciais para conexão:

| Variável | Descrição | Exemplo Padrão |
| :--- | :--- | :--- |
| `SERVER_PORT` | Porta onde o ecossistema Spring Boot rodará | `8080` |
| `SPRING_DATASOURCE_URL` | URL de conexão JDBC para o banco PostgreSQL | `jdbc:postgresql://localhost:5432/meritcoin_db` |
| `SPRING_DATASOURCE_USERNAME`| Usuário root administrador do banco | `postgres` |
| `SPRING_DATASOURCE_PASSWORD`| Senha associada para autenticação do banco | `senha-segura-123` |

---

### 📦 Instalação de Dependências e Build

1. Clone o repositório atual da sua máquina de trabalho:
```bash
git clone (https://github.com/diogotorres13/Sistema-de-Moeda-Estudantil.git)
cd moedas-backend
``` 

Acesse o diretório do Back-end e execute o comando do Maven Wrapper para compilar e baixar as dependências declaradas no pom.xml:

2. 
``` Bash
cd backend
./mvnw clean install
cd moedas-backend
```

 ## 🗄️ Inicialização do Banco de Dados (PostgreSQL)

Para rodar a instância isolada do PostgreSQL na porta padrão sem conflitar com configurações locais, utilize o comando Docker abaixo:

```bash
docker run --name meritcoin_postgres \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=senha-segura-123 \
  -e POSTGRES_DB=meritcoin_db \
  -p 5432:5432 \
  -d postgres:16
```
## ⚡ Como Executar a Aplicação

Com o banco de dados rodando em background, inicie a API do Spring Boot. Ela automaticamente servirá os arquivos estáticos do front-end contidos em `/src/main/resources/static`:

```bash
cd backend
./mvnw spring-boot:run
```
🚀 A aplicação completa estará disponível para testes em seu navegador através do endereço: `http://localhost:8080/index.html`

---

## 🚀 Deploy

Para gerar o artefato final pronto para produção e hospedagem em servidores virtuais (VPS ou plataformas cloud), empacote a aplicação para gerar o executável compactado:

```bash
./mvnw clean package
```
O comando gerará o arquivo executável final dentro da pasta `target`. Execute-o em produção utilizando:

```bash
java -jar target/nome-do-projeto-0.0.1-SNAPSHOT.jar
```

📂 Estrutura de PastasAbaixo está o mapeamento detalhado da organização interna do projeto MeritCoin:.

├── backend/

│   ├── pom.xml                        # Configurações do Maven e dependências (Spring Boot)

│   ├── Dockerfile                     # Instruções para dockerização da aplicação

│   └── src/

│       ├── main/

│       │   ├── java/com/meritcoin/app/

│       │   │   ├── controller/        # Endpoints REST expostos

│       │   │   ├── service/           # Camada de Regras de Negócio e validação de saldos

│       │   │   ├── repository/        # Interfaces de persistência JPA (PostgreSQL)

│       │   │   └── model/             # Entidades de dados (Aluno, Professor, Empresa, Troca)

│       │   └── resources/

│       │       ├── application.yml    # Parametrização das conexões e portas do Spring

│       │       └── static/            # Camada de Visão (Front-end Integrado)

│       │           ├── index.html     # Portal de Acesso e Formulários de Cadastro de Alta Visibilidade

│       │           └── dashboard.html # Painéis de controle, Extratos de Envio e Histórico de Resgates

│       └── test/java/                 # Scripts de teste automatizados e unitários

└── README.md                          # Documentação oficial guiada do projeto

## 🎥 Demonstração

### 🌐 Telas da Aplicação Web (Interface de Alto Contraste)

A interface foi projetada visando legibilidade máxima no modo noturno, garantindo contraste ideal entre os rótulos de dados (`.form-label`) e os inputs em backgrounds escuros.

#### Módulo de Acesso (`index.html`)
* Painel unificado com abas dinâmicas para Login de Usuários, Cadastro de Novos Alunos e Registro de Empresas Parceiras.

#### Painel do Aluno (`dashboard.html`)
* Apresentação nítida de saldos, extrato detalhado de recompensas dadas por professores e a tabela do Histórico de Vantagens.

---

## 🔒📊👨‍💻 Autores

* **Diogo Chaves Torres** - *Desenvolvedor e Engenheiro de Software* - [Meu Perfil GitHub](https://github.com/diogochavestorres)

---

## ⚖️ Licença

Este projeto está sob a licença MIT - consulte o arquivo `LICENSE` para obter mais detalhes de replicação acadêmica.
