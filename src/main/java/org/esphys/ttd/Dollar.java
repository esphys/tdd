package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class Dollar {
    private int amount;
    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
