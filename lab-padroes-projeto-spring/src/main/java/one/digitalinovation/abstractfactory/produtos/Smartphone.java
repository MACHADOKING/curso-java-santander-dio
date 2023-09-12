package one.digitalinovation.abstractfactory.produtos;

import one.digitalinovation.abstractfactory.produtos.interfaces.ProdutoEletronico;

public class Smartphone implements ProdutoEletronico {
    private String descricao;

    public Smartphone(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
