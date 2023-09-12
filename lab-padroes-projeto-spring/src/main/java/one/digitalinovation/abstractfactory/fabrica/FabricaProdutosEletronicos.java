package one.digitalinovation.abstractfactory.fabrica;

import one.digitalinovation.abstractfactory.fabrica.interfaces.FabricaProdutos;
import one.digitalinovation.abstractfactory.produtos.Smartphone;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoEletronico;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoMobilia;

public class FabricaProdutosEletronicos implements FabricaProdutos {
    @Override
    public ProdutoEletronico criarProdutoEletronico(String descricao) {
        return new Smartphone(descricao);
    }

    @Override
    public ProdutoMobilia criarProdutoMobilia(String descricao) {
        // Não suporta a criação de produtos de mobília
        return null;
    }
}
