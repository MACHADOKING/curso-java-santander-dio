# Mini Sistema: Factory Method Pattern

Este projeto demonstra a implementação do Mini Sistema utilizando o Factory Method Pattern no contexto de um aplicativo Spring Boot. O Factory Method Pattern é um padrão de design criacional que permite a criação de objetos de diferentes tipos por meio de uma interface comum.

## Descrição do Mini Sistema

O Mini Sistema tem como objetivo criar pedidos de diferentes tipos, como pedidos de compra e pedidos de venda, por meio de um método de fábrica. O sistema segue a seguinte estrutura:

- Uma interface `Pedido` define os métodos comuns para todos os tipos de pedidos.
- Duas classes concretas, `PedidoCompra` e `PedidoVenda`, implementam a interface `Pedido`, representando diferentes tipos de pedidos.
- Uma interface `FabricaPedido` contém um método de fábrica `criarPedido()`.
- Duas classes de fábrica, `FabricaPedidoCompra` e `FabricaPedidoVenda`, implementam a interface `FabricaPedido` e retornam instâncias dos respectivos pedidos.
- Um controlador Spring chamado `PedidoController` utiliza as fábricas de pedidos para criar diferentes tipos de pedidos.

## Como Realizar Testes

Para testar o Mini Sistema e garantir seu funcionamento correto, siga os passos abaixo:

**1. Configuração Inicial**

Certifique-se de que você tem as seguintes ferramentas e dependências instaladas em seu ambiente de desenvolvimento:

- Java 17 ou superior
- Maven
- Um ambiente de desenvolvimento Java, como o Eclipse ou IntelliJ IDEA (opcional)
- Um cliente REST, como o Postman (opcional)

**2. Clonar o Repositório**

Clone o repositório deste projeto em seu ambiente local usando o seguinte comando:

```bash
git clone https://github.com/MACHADOKING/curso-java-santander-dio/tree/main/lab-padroes-projeto-spring.git
```

**3. Executar o Aplicativo**

Navegue até o diretório raiz do projeto clonado e execute o aplicativo Spring Boot com o seguinte comando:

```bash
mvn spring-boot:run
```

O aplicativo será iniciado e estará disponível em http://localhost:8080.

**4. Testar o Mini Sistema**

Acesse os seguintes endpoints para criar e verificar diferentes tipos de pedidos:

- Crie um pedido de compra: http://localhost:8080/pedido/compra
- Crie um pedido de venda: http://localhost:8080/pedido/venda
- Você pode usar um cliente REST, como o Postman, para enviar solicitações para esses endpoints e verificar as respostas.

**5. Testes de Integração**

Para testar a funcionalidade do controlador PedidoController, você pode criar testes de integração. Esses testes verificam se o controlador está respondendo corretamente às solicitações HTTP e se os pedidos são criados e processados adequadamente. Você pode encontrar exemplos de testes de integração no código-fonte do projeto.

Certifique-se de adaptar e personalizar os testes de acordo com as necessidades específicas do seu projeto.

Com esses passos, você poderá testar e verificar o funcionamento do Mini Sistema com o Factory Method Pattern. Este projeto demonstra como criar objetos de diferentes tipos usando o Factory Method Pattern em um contexto Spring Boot.

---
