package model;

import enums.TipoLanche;

import java.math.BigDecimal;

public abstract class Produto {

    private String pao;
    private String recheios;
    private BigDecimal valor;


    public Produto(TipoLanche tipoLanche, String pao, String recheios, BigDecimal valor) {
        this.pao = pao;
        this.recheios = recheios;
        this.valor = valor;

    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getRecheios() {
        return recheios;
    }

    public void setRecheios(String recheios) {
        this.recheios = recheios;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
