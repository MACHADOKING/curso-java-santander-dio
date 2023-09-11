# Singleton Pattern no Mini Sistema 1

Este documento descreve o uso do Singleton Pattern em um Mini Sistema "ficticio", que é um serviço de configuração em um aplicativo Spring Boot. O Singleton Pattern é um dos Padrões de Design Criacionais e é utilizado para garantir que haja apenas uma instância de uma classe em todo o aplicativo.

## Singleton Pattern

O Singleton Pattern é um padrão de design que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância. Isso é útil quando você deseja ter apenas uma instância de uma classe em todo o seu programa e compartilhar essa instância globalmente. Os principais elementos de um Singleton Pattern são:

- **Construtor Privado**: A classe Singleton tem um construtor privado, impedindo que outras classes criem instâncias dela diretamente.

- **Instância Única**: A própria classe mantém uma instância única da classe.

- **Método de Acesso**: Um método público é fornecido para acessar a instância única. Esse método geralmente cria a instância se ela ainda não existir e a retorna.

## Mini Sistema: Serviço de Configuração

Exemplo que demonstra o uso do Singleton Pattern em um serviço de configuração em um aplicativo Spring Boot. Neste sistema:

- A classe `ConfigService` representa o serviço de configuração.

- O construtor da classe `ConfigService` é privado, impedindo a criação de instâncias externas da classe.

- Uma instância única de `ConfigService` é criada e gerenciada pelo Spring como um componente Singleton.

- Um controlador Spring chamado `ConfigController` usa o `ConfigService` para acessar e exibir configurações.

### Uso do Singleton Pattern

O Singleton Pattern é aplicado nesse mini sistema da seguinte maneira:

```java
@Service
public class ConfigService {
    private String configValue;

    private ConfigService() {
        // Configuração inicial
        this.configValue = "Valor de Configuração Padrão";
    }

    // Métodos de acesso...
}
```

---

# Tutorial para Testar o Mini Sistema 1 com Singleton Pattern no Spring Boot

Este tutorial demonstra como testar um mini sistema que utiliza o Singleton Pattern no Spring Boot. O sistema é um serviço de configuração com a capacidade de ler e atualizar o valor de uma configuração.

## Pré-requisitos

- Java 17 ou versão superior instalado
- Maven instalado
- Um cliente REST, como o [Postman](https://www.postman.com/), [Insomnia](https://insomnia.rest/download) ou [curl](https://curl.se/) (opcional)

## Passos

Siga os passos abaixo para testar o aplicativo:

**Passo 1: Clone o repositório**

Clone o repositório deste projeto em seu ambiente local.

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

**Passo 2: Execute o aplicativo Spring Boot**

Navegue até o diretório raiz do projeto clonado e execute o aplicativo Spring Boot com o seguinte comando:

```bash
mvn spring-boot:run
```

O aplicativo será iniciado e estará disponível em http://localhost:8080.

**Passo 3: Acesse o endpoint para ler a configuração**

Abra um navegador da web ou use um cliente REST para acessar o seguinte endpoint:

```bash
GET http://localhost:8080/config
```

Você receberá uma resposta que mostra o valor atual da configuração, que deve ser "Valor de Configuração Padrão".

**Passo 4: Atualize o valor da configuração**

Para atualizar o valor da configuração, você pode usar um cliente REST ou o curl. Use o seguinte comando curl como exemplo:

```bash
curl -X POST -H "Content-Type: application/json" -d "Novo Valor" http://localhost:8080/config
```

Isso enviará uma solicitação POST para o endpoint /config com o novo valor da configuração. Você receberá uma resposta que confirma a atualização bem-sucedida.

**Passo 5: Verifique o novo valor da configuração**

Agora, acesse novamente o endpoint /config como no Passo 3 para verificar se o valor da configuração foi realmente atualizado. Você deve ver a nova configuração que foi definida.

Isso conclui o teste do mini sistema com Singleton Pattern no Spring Boot. O Singleton Pattern garante que haja apenas uma instância do serviço de configuração em todo o aplicativo.
