# 📚 Desafio LiterAlura

O Desafio LiterAlura é um projeto desenvolvido como parte de um desafio técnico para praticar e demonstrar habilidades em Java, Spring Boot, JPA, e consumo de APIs REST. 🚀

## Funcionalidades
- Buscar livro pelo título
- Listar livros registrados
- Listar autores registrados
- Listar autores vivos em determinado ano
- Listar livros em um determinado idioma
- Listar top 5 livros mais baixados
- Listar livros do autor buscado

## Tecnologias Utilizadas
- Java ☕️
- Spring Boot 🍃
- Spring Data JPA 🗃️
- Hibernate 📚
- PostgresSQL 📦
- Jackson (para deserialização JSON) 🧩
- Maven 🛠️

## Estrutura do Projeto
- DTO: Classes de transferência de dados para mapeamento de respostas da API externa.
- Model: Entidades do banco de dados.
- Repository: Interfaces que estendem JpaRepository para operações de persistência.
- Service: Camada de serviço para lógica de negócios.
- Principal: Classe principal da aplicação que implementa o menu e interação com o usuário.
- ConsumoApi: Classe para realizar requisições HTTP à API externa.
- ConverteDados: Interface e implementação para conversão de dados JSON.
- ChallengeLiterAluraApplication: Classe principal de inicialização do Spring Boot.

## Como Executar
1. Certifique-se de ter o Java JDK e o Maven instalados.
2. Configure as seguintes variaveis de ambiente com seus dados.
- POSTGRES_DB_PASSWORD 
- POSTGRES_DB_USER 
- DB_HOST
3. Clone o repositório para o seu ambiente local.
4. Navegue até o diretório do projeto no terminal.
5. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.
6. Siga as instruções apresentadas no console para interagir com o programa.

## Autor
Este projeto foi desenvolvido por [M0uRa04](https://github.com/M0uRa04) como parte do Desafio LiterAlura.


