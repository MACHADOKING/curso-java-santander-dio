package one.digitalinovation.prototypepattern.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import one.digitalinovation.prototypepattern.Documento;
import one.digitalinovation.prototypepattern.GerenciadorDocumentos;

@RestController
@RequestMapping("/documento")
public class DocumentoController {
    @Autowired
    private GerenciadorDocumentos gerenciadorDocumentos;

    @PostMapping("/adicionar")
    public void adicionarDocumento(@RequestParam String chave, @RequestBody Documento documento) {
        gerenciadorDocumentos.adicionarDocumento(chave, documento);
    }

    @GetMapping("/clonar/{chave}")
    public Documento clonarDocumento(@PathVariable String chave) {
        return gerenciadorDocumentos.clonarDocumento(chave);
    }
}
