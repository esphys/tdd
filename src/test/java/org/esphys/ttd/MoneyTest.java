package org.esphys.ttd;

import junit.framework.TestCase;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class MoneyTest extends TestCase{
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
