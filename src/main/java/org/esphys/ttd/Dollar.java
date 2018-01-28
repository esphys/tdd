package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class Dollar extends Money{
    Dollar(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
