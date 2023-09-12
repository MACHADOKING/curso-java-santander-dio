# Mini Sistema: Builder Pattern

Este projeto demonstra a implementação do Mini Sistema utilizando o Builder Pattern no contexto de um aplicativo Spring Boot. O Builder Pattern é um padrão de design criacional que permite a construção de objetos complexos passo a passo, configurando suas características.

## Descrição do Mini Sistema

É um sistema de construção de casas com diferentes características, como número de quartos, tamanho, etc., usando um construtor. O sistema inclui as seguintes partes:

1. **Classe de Produto (`Casa`)**:

   - A classe `Casa` representa uma casa com atributos que incluem número de quartos, tamanho e outras características.

2. **Classe Builder (`CasaBuilder`)**:

   - A classe `CasaBuilder` permite aos usuários construir uma instância de `Casa` passo a passo, configurando suas características de acordo com as necessidades.

3. **Controlador Spring (CasaController)**:
   - Um controlador Spring que define um endpoint `/casas/construir` que permite aos usuários construir casas com diferentes características usando o `CasaBuilder`.

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

- Abra um terminal ou prompt de comando e navegue até o diretório do projeto onde o Mini Sistema 5 está localizado.

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

- Use um cliente REST, como o Postman, ou seu navegador para criar casas com diferentes características, como número de quartos e tamanho.
- Envie uma solicitação POST para `http://localhost:8080/casas/construir` com as características da casa no corpo da solicitação.

Com essas etapas, você pode construir casas com diferentes configurações usando o Builder Pattern.

Lembre-se de ajustar a solicitação POST de acordo com as características que deseja configurar para a casa.
