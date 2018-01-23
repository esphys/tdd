package org.esphys.ttd;

import junit.framework.TestCase;

/**
 * Created by Evan_2 on 2018-01-23.
 */
public class MoneyTest extends TestCase{
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);

    }
}
