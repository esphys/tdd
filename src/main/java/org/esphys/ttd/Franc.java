package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class Franc extends Money{
    Franc(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
}