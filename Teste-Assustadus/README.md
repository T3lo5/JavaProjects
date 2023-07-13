# Teste tecnico para a vaga da empresa Assustadus

Este é o repositório do backend em Java para o teste técnico da empresa Assustadus. Ele fornece uma API para acessar e interagir com um banco de dados de forma simples entre alunos e cursos.

## Como usar a API

A documentação da API pode ser encontrada [aqui](https://documenter.getpostman.com/view/19719345/2s946chaZ3) no Postman. Ela contém informações detalhadas sobre os endpoints disponíveis, os parâmetros necessários e as respostas esperadas.

Para começar a utilizar a API, siga as etapas abaixo:

1. Faça o download e instale o [Postman](https://www.postman.com/downloads/) em sua máquina.
2. Acesse a [documentação da API](https://documenter.getpostman.com/view/19719345/2s946chaZ3) no Postman.
3. Na documentação, você encontrará a lista de endpoints disponíveis, juntamente com os métodos HTTP correspondentes (GET, POST, PUT, DELETE).
4. Clique em cada endpoint para obter detalhes sobre os parâmetros necessários, cabeçalhos, corpo da solicitação e exemplos de resposta.
5. Para testar os endpoints, clique no botão "Run in Postman" localizado no canto superior direito da documentação. Isso abrirá o Postman com a solicitação preenchida automaticamente.
6. Personalize as solicitações de acordo com suas necessidades (por exemplo, alterando os valores dos parâmetros) e clique em "Send" para fazer a solicitação para a API.
7. Analise as respostas retornadas pela API e utilize os dados conforme necessário.

Certifique-se de fornecer as informações de autenticação necessárias (por exemplo, token de acesso) se sua API exigir autenticação.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado em sua máquina:

- Java Development Kit (JDK) versão 11 ou superior
- Maven
- Banco de dados MySQL [MariaDB] (por exemplo, MySQL, PostgreSQL) instalado e configurado

## Configuração do Banco de Dados

1. Crie um novo banco de dados [nome do banco de dados] no seu servidor local.
2. Abra o arquivo `application.properties` no diretório `src/main/resources`.
3. Atualize as configurações do banco de dados no arquivo `application.properties` de acordo com suas credenciais e informações de conexão. Por exemplo:

spring.datasource.url=jdbc:mysql://localhost:3306/nome-do-banco-de-dados
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha


## Executando o Projeto

Siga as etapas abaixo para baixar, configurar e executar o projeto em sua máquina local:

1. Faça o clone deste repositório para o seu ambiente local.
2. Navegue até o diretório raiz do projeto.
3. Compile o projeto usando o Maven executando o seguinte comando no terminal:
mvn clean install

4. Depois de compilado com sucesso, você pode executar o projeto usando o seguinte comando:

mvn spring-boot:run


5. O servidor será iniciado e o projeto estará acessível em `http://localhost:8080`. Certifique-se de que a porta 8080 esteja disponível em sua máquina.

Certifique-se de fornecer informações adicionais, como detalhes sobre a autenticação, se aplicável, e qualquer outra configuração específica do projeto que seja relevante para a execução adequada do backend.





