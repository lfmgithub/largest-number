package com.lf.largestnumber;

import com.lf.largestnumber.number.NumberImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    private NumberImpl numberImpl;

    @Before
    public void setup() {
        numberImpl = new NumberImpl(new String[] {"190","45","89","9","989","9","0","-50"});
    }

    @Test
    public void findLargestPositiveNumberPossible() {
        assertEquals("9998989451900", numberImpl.findLargestNumber());
    }
}
