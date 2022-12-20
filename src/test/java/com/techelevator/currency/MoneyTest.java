package com.techelevator.currency;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MoneyTest extends TestCase {

    @Test
    public void testPrintBalanceHappy() {
        UserBalance happyPrint = new UserBalance(BigDecimal.valueOf(1.25));
        Assert.assertEquals("$1.25", happyPrint.printBalance());
    }
    @Test
    public void testPrintBalanceZero() {
        UserBalance zeroPrint = new UserBalance(BigDecimal.valueOf(0));
        Assert.assertEquals("$0.00", zeroPrint.printBalance());
    }
}