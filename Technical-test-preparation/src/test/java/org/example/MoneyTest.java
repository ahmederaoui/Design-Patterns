package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void mulipleTest(){
        Dollar five=new Dollar(5);
        five.times(2);
        assertEquals(new Dollar(10),five);
    }
}
