package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class FeetTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1=new Feet(0.0);
        Assert.assertEquals(feet,feet1);

    }
}
