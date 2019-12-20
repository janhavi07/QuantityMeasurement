package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class Temperature {
    @Test
    public void given1CelsiusAnd1Celsius_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.TEMPERATURE.CELSIUS,1.0);
        Quantity Quantity = new Quantity(UnitConverter.TEMPERATURE.CELSIUS, 1.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(add);
    }

    @Test
    public void given1CelsiusAnd2Celsius_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.TEMPERATURE.CELSIUS,1.0);
        Quantity Quantity = new Quantity(UnitConverter.TEMPERATURE.CELSIUS, 2.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertFalse(add);
    }

    @Test
    public void given1FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.TEMPERATURE.FAHRENHEIT,1.0);
        Quantity Quantity = new Quantity(UnitConverter.TEMPERATURE.FAHRENHEIT, 1.0);
        boolean add = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(add);
    }
}
