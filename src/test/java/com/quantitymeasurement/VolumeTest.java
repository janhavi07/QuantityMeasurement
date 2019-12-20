package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void given1GallonAnd3point785Liters_ShouldReturnEqual() {
        Quantity quantity1 = new Quantity(UnitConverter.VOLUME.GALLON, 1.0);
        Quantity quantity = new Quantity(UnitConverter.VOLUME.LITER, 3.78541);
        boolean add = quantity1.compare(quantity1, quantity);
        Assert.assertTrue(add);
    }

    @Test
    public void given1LAnd1000ml_ShouldReturnReturnTrue() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.MILLI_LITRE, 1000.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(add);
    }

    @Test
    public void given1LiterAnd1000ml_ShouldReturn2Liter() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.MILLI_LITRE, 1000.0);
        double add = Quantity1.addTwoLength(Quantity1, Quantity, UnitConverter.VOLUME.LITER.unitConversion);
        Assert.assertEquals(2, add, 0.0);
    }

    @Test
    public void given1GallonAnd3point785Liters_ShouldReturn7point57() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.GALLON, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.LITER, 3.78541);
        double add = Quantity1.addTwoLength(Quantity1, Quantity, UnitConverter.VOLUME.LITER.unitConversion);
        Assert.assertEquals(7.57, add, 0.0);
    }

    @Test
    public void given1LAnd100ml_ShouldReturnReturnNotTrue() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.MILLI_LITRE, 100.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertFalse(add);
    }

    @Test
    public void given1LitersAnd3point785Liters_ShouldReturnNotEquals7point57() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.LITER, 3.78541);
        double add = Quantity1.addTwoLength(Quantity1, Quantity, UnitConverter.VOLUME.LITER.unitConversion);
        Assert.assertNotEquals(7.57, add, 0.0);
    }

    @Test
    public void given1LiterAn1Liter1000ml_ShouldReturn2Liter() {
        Quantity Quantity1 = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.VOLUME.LITER, 1.0);
        double add = Quantity1.addTwoLength(Quantity1, Quantity, UnitConverter.VOLUME.LITER.unitConversion);
        Assert.assertEquals(2, add, 0.0);
    }
}
