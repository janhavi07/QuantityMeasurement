package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void given1GallonhAnd3point785Liters_ShouldReturnEqual() {
        Quantity quantity1 = new Quantity(UnitConverter.VOLUME.GALLON, 1.0);
        Quantity quantity = new Quantity(UnitConverter.VOLUME.LITER, 3.78541);
        boolean add = quantity1.compare(quantity1, quantity);
        Assert.assertTrue(add);
    }
}
//
//    @Test
//    public void given1LAnd1000ml_ShouldReturnReturnTrue() {
//        Length length1 = new Length(UnitConverter.LITER, 1.0);
//        Length length = new Length(UnitConverter.MILLI_LITRE, 1000.0);
//        boolean add = length1.compare(length1, length);
//        Assert.assertTrue(add);
//    }
//
//    @Test
//    public void given1LiterAnd1000ml_ShouldReturn2Liter() {
//        Length length1 = new Length(UnitConverter.LITER, 1.0);
//        Length length = new Length(UnitConverter.MILLI_LITRE, 1000.0);
//        double add = length1.addTwoLength(length1, length, UnitConverter.LITER);
//        Assert.assertEquals(2, add, 0.0);
//    }
//
//    @Test
//    public void given1GallonhAnd3point785Liters_ShouldReturn7point57() {
//        Length length1 = new Length(UnitConverter.GALLON, 1.0);
//        Length length = new Length(UnitConverter.LITER, 3.78541);
//        double add = length1.addTwoLength(length1, length, UnitConverter.LITER);
//        Assert.assertEquals(7.57, add, 0.0);
//    }
//
//
//}
