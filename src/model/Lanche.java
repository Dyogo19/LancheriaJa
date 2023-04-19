package model;

import enums.TipoLanche;

import java.math.BigDecimal;

public abstract class Lanche extends Produto {
    private TipoLanche tipoLanche;

    public Lanche(TipoLanche tipoLanche, String pao, String recheios, BigDecimal valor) {
        super(tipoLanche, pao, recheios, valor);
        this.tipoLanche = tipoLanche;
    }

}



