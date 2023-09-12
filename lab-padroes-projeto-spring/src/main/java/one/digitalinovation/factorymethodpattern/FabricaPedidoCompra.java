package one.digitalinovation.factorymethodpattern;

public class FabricaPedidoCompra implements FabricaPedido {
    @Override
    public Pedido criarPedido() {
        return new PedidoCompra();
    }
}

// Implemente uma classe similar para FabricaPedidoVenda
