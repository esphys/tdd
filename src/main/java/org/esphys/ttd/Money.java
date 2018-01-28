package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-28.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount;
    }
}
