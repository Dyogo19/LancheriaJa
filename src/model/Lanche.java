package model;

import enums.TipoLanche;

import java.math.BigDecimal;

public abstract class Lanche extends Produto {
    private TipoLanche tipoLanche;
    private String tamanhoPao;
    private String recheiosDoLanche;

    public Lanche(TipoLanche tipoLanche, String tamanhoPao, String recheiosDoLanche, BigDecimal valor) {
        super(tipoLanche, valor);
        this.tipoLanche = tipoLanche;
        this.tamanhoPao = tamanhoPao;
        this.recheiosDoLanche = recheiosDoLanche;
    }

    public TipoLanche getTipoLanche() {
        return tipoLanche;
    }

    public void setTipoLanche(TipoLanche tipoLanche) {
        this.tipoLanche = tipoLanche;
    }

    public String getTamanhoPao() {
        return tamanhoPao;
    }

    public void setTamanhoPao(String tamanhoPao) {
        this.tamanhoPao = tamanhoPao;
    }


    public String getRecheiosDoLanche() {
        return recheiosDoLanche;
    }


    public void setRecheiosDoLanche(String recheiosDoLanche) {
        this.recheiosDoLanche = recheiosDoLanche;
    }
}



