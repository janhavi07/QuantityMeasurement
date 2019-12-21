package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class WeightTest {
    @Test
    public void given1kiloAnd1000grams785Liters_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.WEIGHT.KILOGRAM, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.WEIGHT.GRAMS, 1000.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(add);
    }

    @Test
    public void given1TonnesAnd1000Kilo_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.WEIGHT.TONNES, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.WEIGHT.KILOGRAM, 1000.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(add);
    }

    @Test
    public void given1TonneAnd1000Grams_ShouldReturn1001kg() {
        Quantity Quantity1 = new Quantity(UnitConverter.WEIGHT.TONNES, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.WEIGHT.GRAMS, 1000.0);
        double value = Quantity.addTwoLength(Quantity1, Quantity, UnitConverter.WEIGHT.KILOGRAM.unitConversion);
        Assert.assertEquals(1001.0, value, 0.0);
    }

    @Test
    public void given1KelvinAnd1000Grams_ShouldReturn1001kg() {
        Quantity Quantity1 = new Quantity(UnitConverter.TEMPERATURE.CELSIUS, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.WEIGHT.GRAMS, 1000.0);
        double value = Quantity.addTwoLength(Quantity1, Quantity, UnitConverter.WEIGHT.KILOGRAM.unitConversion);
        Assert.assertNotEquals(1001.0, value, 0.0);
    }

    @Test
    public void given1kgAnd1Celsius_ShouldReturnFalse() {
        Quantity Quantity1 = new Quantity(UnitConverter.TEMPERATURE.CELSIUS, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.WEIGHT.KILOGRAM, 1.0);
        double value = Quantity.addTwoLength(Quantity1, Quantity, UnitConverter.WEIGHT.GRAMS.unitConversion);
        Assert.assertNotEquals(2, value);
    }
}
