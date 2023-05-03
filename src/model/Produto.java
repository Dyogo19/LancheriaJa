package model;

import enums.TipoLanche;

import java.math.BigDecimal;

public abstract class Produto {

    private BigDecimal valor;


    public Produto(TipoLanche tipoLanche, BigDecimal valor) {
        this.valor = valor;

    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
