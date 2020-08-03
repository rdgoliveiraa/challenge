# Projeto Challenge

API REST para calculo de combustível utilizado por veículos.

## Começando

Essas instruções fornecerão uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e teste.

### Pré requisitos

- JAVA 11
- MAVEN 3.6.3
- Firebase 3.0


### Inicilização

Para a geração do executável do executável da aplicação é necessário configurar o arquivo **application.properties** e editar as propriedades **spring.datasource.url**, **spring.datasource.username** e **spring.datasource.password** 
```
spring.datasource.url=jdbc:firebirdsql://localhost:3050//home/rodrigo/Desenvolvimento/firebird/challenge.fdb
spring.datasource.driverClassName=org.firebirdsql.jdbc.FBDriver
spring.jpa.database-platform=org.hibernate.dialect.FirebirdDialect
spring.datasource.username=sysdba
spring.datasource.password=937966db
spring.jpa.hibernate.ddl-auto=update
```

Após realizar o ajuste deverá ser executado o seguinte comando para geração do jar através do prompt de comando:

```
mvn clean install
mvn package
```

Com isso será gerado o arquivo *.jar* que poderá ser executado para rodar a aplicação.

## Autor

* **Rodrigo Oliveira de Almeida** - [Rodrigo Oliveira de Almeida](https://github.com/rdgoliveiraa)
