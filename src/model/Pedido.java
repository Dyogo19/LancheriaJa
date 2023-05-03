package model;

import enums.FormaDeRetirar;
import enums.FormaPagamento;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private FormaPagamento formaPagamento;

    private FormaDeRetirar formaDeRetirar;
    private long id;
    private static long ultimoId;
    private LocalDateTime dataEHoraDoPedido;
    private List<Produto> produtos;


    public Pedido(FormaPagamento formaPagamento, LocalDateTime dataEHoraDoPedido, List<Produto> produtos, FormaDeRetirar formaDeRetirar) {
        this.formaPagamento = formaPagamento;
        this.formaDeRetirar = formaDeRetirar;
        this.dataEHoraDoPedido = dataEHoraDoPedido;
        this.produtos = produtos;

    }


    public long getId() {
        ultimoId++;
        id = ultimoId;
        return this.id;
    }

//Calcular os valores, conforme cada tipo de pagamento e cada tipo de entrega;
    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotalPedido = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            valorTotalPedido = valorTotalPedido.add(produto.getValor());


            if (formaPagamento == FormaPagamento.PIX) {


                BigDecimal descontoPorPix = new BigDecimal("0.05");
                BigDecimal valorDesconto = valorTotalPedido.multiply(descontoPorPix);
                BigDecimal novoValorTotalPedido = valorTotalPedido.subtract(valorDesconto);
                valorTotalPedido = novoValorTotalPedido;

            } else if (formaPagamento == FormaPagamento.DINHEIRO) {


                BigDecimal descontoPorDinheiro = new BigDecimal("0.10");
                BigDecimal valorDesconto = valorTotalPedido.multiply(descontoPorDinheiro);
                BigDecimal novoValorTotalPedido = valorTotalPedido.subtract(valorDesconto);
                valorTotalPedido = novoValorTotalPedido;

            } else if (formaPagamento == FormaPagamento.CARTAO) {


                BigDecimal acrescimoPorCartao = new BigDecimal("0.03");
                BigDecimal valorAcrescimo = valorTotalPedido.multiply(acrescimoPorCartao);
                BigDecimal novoValorTotalPedido = valorTotalPedido.add(valorAcrescimo);
                valorTotalPedido = novoValorTotalPedido;
            }

            if (formaDeRetirar == FormaDeRetirar.RETIRAR_COM_TELE) {
                BigDecimal valoracrescimoPorContaDaTele = new BigDecimal("5.00");
                BigDecimal acrescimoPorContaDaTele = valorTotalPedido.add(valoracrescimoPorContaDaTele);
                valorTotalPedido = acrescimoPorContaDaTele;
            }
            return valorTotalPedido;
        }


        return valorTotalPedido;

    }
}



