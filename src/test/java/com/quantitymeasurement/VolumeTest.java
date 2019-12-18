package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void given1GallonhAnd3point785Liters_ShouldReturnEqual() {
        Length length1 = new Length(Unit.GALLON, 1.0);
        Length length = new Length(Unit.LITER, 3.78541);
        boolean add = length1.compare(length1, length);
        Assert.assertTrue(add);
    }

    @Test
    public void given1LAnd1000ml_ShouldReturnReturnTrue() {
        Length length1 = new Length(Unit.LITER, 1.0);
        Length length = new Length(Unit.MILLI_LITRE, 1000.0);
        boolean add = length1.compare(length1, length);
        Assert.assertTrue(add);
    }


}
