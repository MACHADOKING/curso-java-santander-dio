# Mini Sistema: Prototype Pattern

Este projeto demonstra a implementação do Mini Sistema utilizando o Prototype Pattern no contexto de um aplicativo Spring Boot. O Prototype Pattern é um padrão de design criacional que permite a criação de objetos por meio de cópias de protótipos existentes.

## Descrição do Mini Sistema

O Mini Sistema é um sistema de gerenciamento de documentos que permite aos usuários criar e clonar documentos. O sistema é composto por três principais componentes:

1. **Classe Documento**:

   - Esta classe representa um documento com dois atributos: `titulo` e `conteudo`.
   - Implementa a interface `Cloneable` para permitir a clonagem de documentos.
   - Fornece métodos getters e setters para acessar e definir os atributos.

2. **Classe GerenciadorDocumentos**:

   - Este é um serviço Spring que gerencia documentos e oferece funcionalidades para adicionar e clonar documentos.
   - Usa um mapa para armazenar documentos associados a chaves.
   - Permite a adição de documentos com uma chave específica.
   - Permite a clonagem de documentos existentes com base em suas chaves.

3. **Controlador Spring (DocumentoController)**:
   - Este é um controlador Spring que define endpoints para manipular documentos.
   - O endpoint `/documento/adicionar` permite adicionar um documento com uma chave específica. O documento é enviado como JSON no corpo da solicitação.
   - O endpoint `/documento/clonar/{chave}` permite clonar um documento com base em sua chave. O documento clonado é retornado como JSON na resposta.

## Como Testar

Para testar o Mini Sistema e verificar seu funcionamento, siga as etapas abaixo:

**1. Requisitos**

Para executar e testar, você deve ter o seguinte software instalado em seu ambiente de desenvolvimento:

- **Java**: O projeto foi desenvolvido usando Java 16, portanto, é recomendável ter o Java 16 ou superior instalado em seu sistema. Você pode baixar o Java mais recente em [OpenJDK](https://adoptopenjdk.net/).

- **Maven**: O Maven é usado para gerenciar as dependências e compilar o projeto. Certifique-se de ter o Maven instalado em seu sistema. Você pode baixar o Maven em [Maven](https://maven.apache.org/download.cgi).

**2. Clonar o Repositório**

- Clone o repositório deste projeto em seu ambiente local usando o seguinte comando:
  ```
  git clone https://github.com/MACHADOKING/curso-java-santander-dio/tree/main/lab-padroes-projeto-spring.git
  ```
  Substitua `seu-usuario` pelo seu nome de usuário no GitHub e `seu-repositorio` pelo nome do repositório onde você implementou o Mini Sistema.

**3. Navegar para o Diretório do Projeto**

- Abra um terminal ou prompt de comando e navegue até o diretório do projeto onde o Mini Sistema está localizado.

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

- Use uma ferramenta de cliente REST, como o Postman, ou seu navegador para testar o Mini Sistema.
- Para criar um documento, envie uma solicitação POST para `http://localhost:8080/documento/adicionar` com o corpo JSON de exemplo.
- Para clonar um documento, acesse `http://localhost:8080/documento/clonar/{chave}` no seu navegador, onde `{chave}` é a chave do documento que você deseja clonar.

Com essas etapas, você pode criar e clonar documentos usando o Mini Sistema com o Prototype Pattern. Personalize os testes de acordo com as necessidades específicas do seu projeto.
