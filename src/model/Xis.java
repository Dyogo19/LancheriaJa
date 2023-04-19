package model;

import enums.SaborXis;
import enums.TipoLanche;

import java.math.BigDecimal;

public class Xis extends Lanche {

    private SaborXis sabor;

    public Xis(TipoLanche tipoLanche, String pao, String recheios, BigDecimal valor, SaborXis sabor) {
        super(tipoLanche, pao, recheios, valor);
        this.sabor = sabor;
    }

}
