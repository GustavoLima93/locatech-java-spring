# Projeto de API RESTful com Spring MVC - Locatech

- Este projeto foi desenvolvido como parte do curso de Spring MVC APIs RESTful, oferecido pela Pós Tech FIAP + Alura. O objetivo é criar uma API RESTful para uma aplicação de locação de carros, denominada Locatech. Durante o curso, exploramos desde os fundamentos do Spring MVC até a implementação de boas práticas de manutenção em APIs.

## 📚 Estrutura do Curso

- O curso é estruturado em cinco aulas principais, que cobrem desde a configuração do projeto até o desenvolvimento de uma API seguindo as melhores práticas.

## Aulas

### Introdução ao Spring MVC

- Nesta aula, apresentamos o framework Spring MVC, destacando suas principais características e como ele facilita a criação de APIs RESTful. Exploramos os conceitos básicos de MVC e a importância de cada camada na construção de aplicações.

### Criação e Configuração de um Projeto

- Aprendemos a configurar um projeto Spring Boot para APIs RESTful, criando o arquivo pom.xml com as dependências necessárias, configurando as propriedades do projeto e estruturando a base do projeto Locatech.

### Introdução à API REST

- Nesta aula, foram abordados os princípios REST e as práticas recomendadas para o desenvolvimento de APIs. Discutimos o uso de métodos HTTP (GET, POST, PUT, DELETE) e boas práticas de design de endpoints.

### Desenvolvimento de API REST com Spring MVC

- Implementamos a lógica da API, criando controllers, serviços e repositórios para os recursos da aplicação. Aprendemos a mapear endpoints e a manipular requisições e respostas usando Spring MVC.

### Boas Práticas e Manutenção

- Nesta última aula, focamos em implementar boas práticas, como o uso de validações com Bean Validation, documentação automática da API com Swagger e técnicas de versionamento. Também discutimos formas de garantir a manutenção do código ao longo do tempo.

## 🚀 Funcionalidades do Projeto
- A API desenvolvida possui as seguintes funcionalidades principais:

  - Gerenciamento de Locação de Carros: inclui endpoints para criar, listar, atualizar e deletar registros de locação.
  - Validação de Dados: validações automáticas utilizando o Bean Validation para garantir a integridade dos dados.
  - Documentação da API: documentação gerada automaticamente com Swagger para facilitar o consumo dos endpoints.
  - Banco de Dados Embutido (H2): para facilitar o desenvolvimento e testes.

## 🛠️ Configuração do Projeto

- O projeto foi configurado com as seguintes dependências, conforme o pom.xml:

  - Spring Boot 3.3.2 como framework principal
  - spring-boot-starter-web para suporte à criação de APIs
  - spring-boot-starter-validation para validação de dados
  - springdoc-openapi-starter-webmvc-ui para a documentação da API (Swagger)
  - H2 Database como banco de dados em memória
  - Lombok para reduzir boilerplate de código
