# 🎬 MovieFlix API

MovieFlix é uma API REST desenvolvida em Java com Spring Boot, projetada para gerenciar um catálogo de filmes, categorias e plataformas de streaming. O projeto utiliza Docker para facilitar a configuração do ambiente de banco de dados, promovendo uma experiência de desenvolvimento mais ágil e padronizada.

## 🚀 Tecnologias Utilizadas

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework para criação de aplicações Java.
- **Maven**: Gerenciador de dependências e build.
- **Docker & Docker Compose**: Para containerização e orquestração do ambiente de banco de dados.
- **Banco de Dados**: PostgreSQL via Docker.
- **JPA/Hibernate**: Para mapeamento objeto-relacional.

## 📁 Estrutura do Projeto

```
movieflix/
├── .mvn/                 # Scripts do Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/         # Código-fonte Java
│   │   └── resources/    # Arquivos de configuração e recursos
├── docker-compose.yml    # Configuração do ambiente Docker
├── pom.xml               # Arquivo de configuração do Maven
├── mvnw, mvnw.cmd        # Scripts do Maven Wrapper
└── README.md             # Documentação do projeto
```

## ⚙️ Configuração e Execução

### 1. Clonar o Repositório

```bash
git clone https://github.com/gvbrielcosta/movieflix.git
cd movieflix
```

### 2. Configurar o Banco de Dados com Docker

Certifique-se de que o Docker e o Docker Compose estão instalados em sua máquina. Em seguida, execute:

```bash
docker-compose up -d
```

Isso iniciará o serviço de banco de dados definido no `docker-compose.yml`.

### 3. Compilar e Executar a Aplicação

Utilize o Maven Wrapper para compilar e executar a aplicação:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## 📌 Funcionalidades

- **Cadastro de Filmes**: Permite adicionar novos filmes ao catálogo.
- **Gerenciamento de Categorias**: Organização dos filmes por categorias.
- **Plataformas de Streaming**: Associação dos filmes às plataformas onde estão disponíveis.

## 🔧 Endpoints da API

> *Nota: A documentação detalhada dos endpoints ainda não está disponível.*

## 🐳 Sobre o docker-compose.yml

O arquivo `docker-compose.yml` é utilizado para configurar e iniciar o ambiente de banco de dados necessário para a aplicação. Ele define os serviços, volumes e redes necessários para o funcionamento correto do banco de dados em um contêiner Docker.


