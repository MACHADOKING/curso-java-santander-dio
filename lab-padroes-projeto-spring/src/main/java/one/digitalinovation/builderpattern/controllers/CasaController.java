package one.digitalinovation.builderpattern.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.builderpattern.Casa;
import one.digitalinovation.builderpattern.CasaBuilder;

@RestController
@RequestMapping("/casas")
public class CasaController {
    @PostMapping("/construir")
    public Casa construirCasa(@RequestBody Casa casa) {
        // Use os atributos da casa diretamente para construir a instância
        return new CasaBuilder()
                .numeroQuartos(casa.getNumeroQuartos())
                .tamanho(casa.getTamanho())
                // Configure outras características da casa aqui, se necessário
                .build();
    }
}
