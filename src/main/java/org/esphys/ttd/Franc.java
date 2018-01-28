package org.esphys.ttd;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class Franc extends Money{
    private String currency;
    Franc(int amount){
        this.amount = amount;
        currency = "CHF";
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
}