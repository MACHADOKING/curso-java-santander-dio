package one.digitalinovation.abstractfactory.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.abstractfactory.fabrica.FabricaProdutosEletronicos;
import one.digitalinovation.abstractfactory.fabrica.FabricaProdutosMoveis;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoEletronico;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoMobilia;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final FabricaProdutosEletronicos fabricaEletronicos;
    private final FabricaProdutosMoveis fabricaMoveis;

    public ProdutoController(FabricaProdutosEletronicos fabricaEletronicos, FabricaProdutosMoveis fabricaMoveis) {
        this.fabricaEletronicos = fabricaEletronicos;
        this.fabricaMoveis = fabricaMoveis;
    }

    @PostMapping("/eletronico")
    public String criarProdutoEletronico(@RequestBody String descricao) {
        ProdutoEletronico produto = fabricaEletronicos.criarProdutoEletronico(descricao);
        return "Produto eletrônico criado: " + produto.getDescricao();
    }

    @PostMapping("/mobilia")
    public String criarProdutoMobilia(@RequestBody String descricao) {
        ProdutoMobilia produto = fabricaMoveis.criarProdutoMobilia(descricao);
        return "Produto de mobília criado: " + produto.getDescricao();
    }
}
