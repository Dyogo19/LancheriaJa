package service;


import model.Pedido;
import model.Usuario;


public class PedidoService {

    public void efetuarPedido(Pedido pedido, Usuario usuario) {


        System.out.println("Pedido #" + pedido.getId() + " Do usuario #" + usuario.getIdUsuario() + " efetuado com sucesso!");
        System.out.println("Valor total: " + pedido.calcularValorTotal());
    }
}
