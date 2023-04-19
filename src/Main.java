import enums.FormaPagamento;
import enums.SaborDog;
import enums.SaborXis;
import enums.TipoLanche;
import model.*;
import service.PedidoService;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Criando endereços
        Endereço endereçoUsuario1 = new Endereço("Jovelino de Souza" , "Americana" , "Porto Alegre" , "RS");
        Endereço endereçoUsuario2 = new Endereço("Pindorama" , "Americana" , "Porto Alegre" , "RS");
        Endereço endereçoUsuario3 = new Endereço("Amapa" , "Americana" , "Porto Alegre" , "RS");

        //Criando Usuarios
        Usuario usuario1 = new Usuario("Dyogo" , "08879087098" , endereçoUsuario1);
        Usuario usuario2 = new Usuario("Dyogo" , "08879087098" , endereçoUsuario2);
        Usuario usuario3 = new Usuario("Dyogo" , "08879087098" , endereçoUsuario3);

        //Criando Produtos
        Produto produto1 = new Xis(TipoLanche.XIS , "Grande" , "Milho, Ervilha , Tomate , Queijo, Maionese" , new BigDecimal(25) , SaborXis.CARNE);
        Produto produto2 = new Dog(TipoLanche.DOG , "Grande" , "Milho, Ervilha, Maionese, Queijo, Purê de batata, Batata palha" , new BigDecimal(22) , SaborDog.SALSICHA);



        Pedido pedido1 = new Pedido(FormaPagamento.PIX , LocalDateTime.of(2022 ,04 , 04 ,  20 ,50) , Arrays.asList(produto1));
        Pedido pedido2 = new Pedido(FormaPagamento.DINHEIRO , LocalDateTime.of(2022 ,04 , 04 ,  20 ,50) , Arrays.asList(produto2));
        Pedido pedido3 = new Pedido(FormaPagamento.CARTAO , LocalDateTime.of(2022 ,04 , 04 ,  20 ,50) , Arrays.asList(produto1, produto2));

        PedidoService service = new PedidoService();
        service.efetuarPedido(pedido1 , usuario1);
        service.efetuarPedido(pedido2 , usuario2);
        service.efetuarPedido(pedido3 , usuario3);

    }
}