package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class Dollar extends Money{
    Dollar(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }

}
