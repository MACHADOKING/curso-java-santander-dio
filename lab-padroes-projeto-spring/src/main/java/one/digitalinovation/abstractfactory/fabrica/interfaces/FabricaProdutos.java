package one.digitalinovation.abstractfactory.fabrica.interfaces;

import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoEletronico;
import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoMobilia;

public interface FabricaProdutos {
    ProdutoEletronico criarProdutoEletronico(String descricao);

    ProdutoMobilia criarProdutoMobilia(String descricao);
}
