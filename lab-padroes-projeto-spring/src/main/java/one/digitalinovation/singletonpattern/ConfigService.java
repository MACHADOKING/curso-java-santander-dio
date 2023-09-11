package one.digitalinovation.singletonpattern;

/*
 * A classe ConfigService que representará o serviço de configuração e 
 * garantirá que seja um Singleton. 
 * 
 * Vamos também definir algumas configurações 
 * (valores de propriedades) nesta classe.
 */

import org.springframework.stereotype.Service;

/*
 * A anotação @Service do Spring torna a classe ConfigService 
 * um componente gerenciado pelo Spring como um Singleton.
 */

@Service
public class ConfigService {
    private String configValue;

    private ConfigService() {
        // Configuração inicial
        this.configValue = "Valor de Configuração Padrão";
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
