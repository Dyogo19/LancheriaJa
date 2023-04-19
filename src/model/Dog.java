package model;

import enums.SaborDog;
import enums.TipoLanche;

import java.math.BigDecimal;

public class Dog extends Lanche {

    private SaborDog sabor;

    public Dog(TipoLanche tipoLanche, String pao, String recheios, BigDecimal valor , SaborDog sabor) {
        super(tipoLanche, pao, recheios, valor);
        this.sabor = sabor;
    }

}
