package one.digitalinovation.singletonpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.singletonpattern.ConfigService;

/*
 * O ConfigController usará o ConfigService para acessar e exibir as configurações. 
 * Vai criar um endpoint para ler e atualizar o valor da configuração.
 
 * Neste controlador, foi usado injeção de dependência para obter uma instância única do ConfigService 
 * e foi definido dois endpoints:

 * GET /config: Retorna o valor da configuração atual.
 * POST /config: Atualiza o valor da configuração com base na carga útil JSON fornecida.
*/

@RestController
public class ConfigController {
    private final ConfigService configService;

    @Autowired
    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/config")
    public String getConfig() {
        return "Valor da Configuração: " + configService.getConfigValue();
    }

    @PostMapping("/config")
    public String updateConfig(@RequestBody String newValue) {
        configService.setConfigValue(newValue);
        return "Valor da Configuração atualizado com sucesso para: " + newValue;
    }
}
