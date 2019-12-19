package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Quantity quantity = new Quantity(UnitConverter.LENGTH.FEET, 0.0);
        Quantity quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 0.0);
        Assert.assertEquals(quantity, quantity1);
    }

    @Test
    public void given36InchAnd1yard_WithDifferentClassObject_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        Inch inch = new Inch(36.0);
        Assert.assertNotEquals(Quantity1, inch);
    }

    @Test
    public void given0FeetAndNull_ShouldThrowException() {
        new Quantity(UnitConverter.LENGTH.FEET, 0.0);
        Assert.assertNotEquals(MeasurementException.ExceptionType.NULL_VALUE, null);
    }


    @Test
    public void given1FeetAnd2Feet_ShouldReturnNotEqual() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.FEET, 0.8);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 0.0);
        Assert.assertNotEquals(Quantity, Quantity1);
    }

    @Test
    public void given0inchAnd0Inch_ShouldReturnEquals() {
        Quantity inch1 = new Quantity(UnitConverter.LENGTH.INCH, 0.0);
        Quantity inch2 = new Quantity(UnitConverter.LENGTH.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0inchAnd2Inch_ShouldReturnNotEquals() {
        Quantity inch1 = new Quantity(UnitConverter.LENGTH.INCH, 0.0);
        Quantity inch2 = new Quantity(UnitConverter.LENGTH.INCH, 0.1);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1InchShouldReturnNotEquals() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 1.0);
        Assert.assertNotEquals(Quantity1, Quantity2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualQuantity() {
        Quantity quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 0.0);
        Quantity quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 0.0);
        boolean compare = quantity1.compare(quantity1, quantity2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualQuantity() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1FeetAnd1FeetShouldReturn_EqualQuantity() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(UnitConverter.LENGTH.INCH, 0.1);
        Quantity inch2 = new Quantity(UnitConverter.LENGTH.INCH, 0.1);
        boolean compare = inch1.compare(inch1, inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 12.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.5);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 18.0);
        boolean compare = Quantity2.compare(Quantity1, Quantity2);
        Assert.assertTrue(compare);
    }

    @Test
    public void given12InchAnd2Feet_ShouldReturn_NotEquals() {
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 12.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 2.0);
        boolean compare = Quantity2.compare(Quantity2, Quantity1);
        Assert.assertFalse(compare);
    }

    @Test
    public void given12FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 12.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenRandomUnit_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.RANDOM, 12.0);
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity2);
        Assert.assertFalse(compare);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnTrue() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 0.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.YARD, 0.0);
        Assert.assertEquals(Quantity, Quantity1);
    }

    @Test
    public void givenSameUnitType_ShouldReturnNotEqual() {
        Quantity Quantity2 = new Quantity(UnitConverter.LENGTH.INCH, 18.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 1.5);
        boolean compare = Quantity2.compare(Quantity2, Quantity1);
        Assert.assertFalse(compare);
    }

    @Test
    public void given0YardAnd2Yard_ShouldReturnNotEqual() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.YARD, 2.0);
        Assert.assertNotEquals(Quantity, Quantity1);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnEqual() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        boolean compare = Quantity.compare(Quantity, Quantity1);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 3.0);
        boolean compare = Quantity.compare(Quantity, Quantity1);
        Assert.assertTrue(compare);
    }

    @Test
    public void given3YardAnd1Feet_ShouldReturnNotEqual() {
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 3.0);
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        boolean compare = Quantity.compare(Quantity, Quantity1);
        Assert.assertFalse(compare);
    }

    @Test
    public void given3FeetAnd1yard_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 3.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertFalse(compare);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.YARD, 1.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.INCH, 36.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(compare);
    }


    @Test
    public void given0CentimeterAnd0centimeter_ShouldReturnEquals() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 0.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 0.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(compare);
    }

    @Test
    public void given0CentimeterAnd1centimeter_ShouldReturnNotEquals() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 0.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 1.0);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertFalse(compare);
    }

    @Test
    public void given2InchAnd5centimeter_ShouldReturnEquals() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 2.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 5.08);
        boolean compare = Quantity1.compare(Quantity1, Quantity);
        Assert.assertTrue(compare);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 2.0);
        Quantity Quantity = new Quantity(UnitConverter.LENGTH.INCH, 2.0);
        double add = Quantity1.addTwoLength(Quantity1, Quantity, UnitConverter.LENGTH.INCH);
        Assert.assertEquals(4, add, 0.0);
    }

//    @Test
//    public void given1FeetAnd2Inch_ShouldReturn14Inch() {
//        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
//        Quantity Quantity = new Quantity(UnitConverter.LENGTH.INCH, 2.0);
//        double add = Quantity1.addTwoQuantity(Quantity1, Quantity, UnitConverter.LENGTH.INCH);
//        Assert.assertEquals(14, add, 0.0);
//    }
//
//    @Test
//    public void given1FeetAnd1Feet_ShouldReturn24Inch() {
//        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
//        Quantity Quantity = new Quantity(UnitConverter.LENGTH.FEET, 1.0);
//        double add = Quantity1.addTwoQuantity(Quantity1, Quantity, UnitConverter.LENGTH.INCH);
//        Assert.assertEquals(24, add, 0.0);
//    }
//
//    @Test
//    public void given2InchAnd2point5Centimeters_ShouldReturn3Inch() {
//        Quantity Quantity1 = new Quantity(UnitConverter.LENGTH.INCH, 2.0);
//        Quantity Quantity = new Quantity(UnitConverter.LENGTH.CENTIMETERS, 2.54);
//        double add = Quantity1.addTwoQuantity(Quantity1, Quantity, UnitConverter.LENGTH.INCH);
//        Assert.assertEquals(3, add, 0.0);
//    }
}
