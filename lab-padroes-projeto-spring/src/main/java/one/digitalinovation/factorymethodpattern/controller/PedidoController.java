package one.digitalinovation.factorymethodpattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.factorymethodpattern.FabricaPedido;
import one.digitalinovation.factorymethodpattern.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    private final FabricaPedido fabricaPedido;

    public PedidoController(FabricaPedido fabricaPedido) {
        this.fabricaPedido = fabricaPedido;
    }

    @GetMapping("/compra")
    public String criarPedidoCompra() {
        Pedido pedidoCompra = fabricaPedido.criarPedido();
        pedidoCompra.processarPedido();
        return "Pedido de compra criado e processado com sucesso.";
    }
}
