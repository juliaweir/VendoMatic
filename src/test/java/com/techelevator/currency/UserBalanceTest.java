package com.techelevator.currency;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

import java.math.BigDecimal;

public class UserBalanceTest extends TestCase {
    @Test
    public void testReturnChangeHappy() {
        UserBalance changeHappy = new UserBalance(BigDecimal.valueOf(1.40));
        Map<String, Integer> change = new HashMap<String, Integer>();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("Quarters", 5);
        expected.put("Dimes", 1);
        expected.put("Nickels", 1);
        change = changeHappy.returnChange(changeHappy.getBalance());
        Assert.assertEquals(change, expected);
    }
}