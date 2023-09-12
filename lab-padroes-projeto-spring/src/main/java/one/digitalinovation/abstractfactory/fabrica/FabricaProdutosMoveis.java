package one.digitalinovation.abstractfactory.fabrica;

import one.digitalinovation.abstractfactory.fabrica.interfaces.FabricaProdutos;
import one.digitalinovation.abstractfactory.produtos.Sofa;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoEletronico;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoMobilia;

public class FabricaProdutosMoveis implements FabricaProdutos {
    @Override
    public ProdutoEletronico criarProdutoEletronico(String descricao) {
        // Não suporta a criação de produtos eletrônicos
        return null;
    }

    @Override
    public ProdutoMobilia criarProdutoMobilia(String descricao) {
        return new Sofa(descricao);
    }
}
