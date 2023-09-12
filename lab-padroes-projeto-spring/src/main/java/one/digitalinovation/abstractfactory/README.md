# Mini Sistema: Abstract Factory Pattern

Este projeto demonstra a implementação do Mini Sistema utilizando o Abstract Factory Pattern no contexto de um aplicativo Spring Boot. O Abstract Factory Pattern é um padrão de design criacional que permite a criação de famílias de objetos relacionados sem especificar suas classes concretas.

## Descrição do Mini Sistema

É um sistema de fabricação de produtos com duas categorias distintas: Eletrônicos e Móveis. Cada categoria possui sua própria fábrica responsável pela criação dos produtos relacionados. O sistema inclui as seguintes partes:

1. **Interfaces e Classes de Produto**:

   - `ProdutoEletronico`: Uma interface que representa produtos eletrônicos com um método `getDescricao()`.
   - `Smartphone`: Uma classe que implementa `ProdutoEletronico` e representa um smartphone.
   - `ProdutoMobilia`: Uma interface que representa produtos de mobília com um método `getDescricao()`.
   - `Sofa`: Uma classe que implementa `ProdutoMobilia` e representa um sofá.

2. **Interfaces e Classes de Fábrica**:

   - `FabricaProdutos`: Uma interface que define métodos para criar produtos eletrônicos e móveis.
   - `FabricaProdutosEletronicos`: Uma classe que implementa `FabricaProdutos` e cria produtos eletrônicos, como smartphones.
   - `FabricaProdutosMoveis`: Uma classe que implementa `FabricaProdutos` e cria produtos de mobília, como sofás.

3. **Controlador Spring (ProdutoController)**:
   - Um controlador Spring que permite aos usuários criar produtos eletrônicos e de mobília usando as fábricas.
   - Dois endpoints estão disponíveis: `/produtos/eletronico` para criar produtos eletrônicos e `/produtos/mobilia` para criar produtos de mobília.

## Requisitos

Para executar e testar, você deve ter o seguinte software instalado em seu ambiente de desenvolvimento:

- **Java**: O projeto foi desenvolvido usando Java 16, portanto, é recomendável ter o Java 16 ou superior instalado em seu sistema. Você pode baixar o Java mais recente em [OpenJDK](https://adoptopenjdk.net/).

- **Maven**: O Maven é usado para gerenciar as dependências e compilar o projeto. Certifique-se de ter o Maven instalado em seu sistema. Você pode baixar o Maven em [Maven](https://maven.apache.org/download.cgi).

## Como Testar

Para testar e verificar seu funcionamento, siga as etapas abaixo:

**1. Configuração Inicial**

- Certifique-se de que você tenha o Java (preferencialmente Java 16 ou superior) e o Maven instalados em seu sistema.

**2. Clonar o Repositório**

- Clone o repositório deste projeto em seu ambiente local usando o seguinte comando:
  ```
  git clone https://github.com/MACHADOKING/curso-java-santander-dio/tree/main/lab-padroes-projeto-spring.git
  ```

**3. Navegar para o Diretório do Projeto**

- Abra um terminal ou prompt de comando e navegue até o diretório do projeto onde está localizado.

**4. Compilar o Projeto**

- Execute o seguinte comando Maven para compilar o projeto:
  ```
  mvn clean install
  ```

**5. Executar o Aplicativo**

- Após a compilação bem-sucedida, inicie o aplicativo Spring Boot com o seguinte comando:
  ```
  mvn spring-boot:run
  ```
  O aplicativo será iniciado e estará disponível em `http://localhost:8080`.

**6. Testar o Mini Sistema**

- Use um cliente REST, como o Postman, ou seu navegador para criar produtos eletrônicos e de mobília.
- Para criar um produto eletrônico, envie uma solicitação POST para `http://localhost:8080/produtos/eletronico` com a descrição do produto no corpo da solicitação.
- Para criar um produto de mobília, envie uma solicitação POST para `http://localhost:8080/produtos/mobilia` com a descrição do produto no corpo da solicitação.

Com essas etapas, você pode criar produtos eletrônicos
