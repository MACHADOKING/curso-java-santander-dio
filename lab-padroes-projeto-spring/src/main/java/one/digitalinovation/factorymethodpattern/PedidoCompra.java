package one.digitalinovation.factorymethodpattern;

public class PedidoCompra implements Pedido {
    @Override
    public void processarPedido() {
        System.out.println("Processando pedido de compra.");
    }
}
