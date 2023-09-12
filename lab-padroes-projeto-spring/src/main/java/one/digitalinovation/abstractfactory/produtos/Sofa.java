package one.digitalinovation.abstractfactory.produtos;

import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoMobilia;

public class Sofa implements ProdutoMobilia {
    private String descricao;

    public Sofa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
