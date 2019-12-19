//package com.quantitymeasurement;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class WeightTest {
//    @Test
//    public void given1kiloAnd1000grams785Liters_ShouldReturnEqual() {
//        Length length1 = new Length(UnitConverter.KILOGRAM, 1.0);
//        Length length = new Length(UnitConverter.GRAMS, 1000.0);
//        boolean add = length1.compare(length1, length);
//        Assert.assertTrue(add);
//    }
//
//    @Test
//    public void given1TonnesAnd1000Kilo_ShouldReturnEqual() {
//        Length length1 = new Length(UnitConverter.TONNES, 1.0);
//        Length length = new Length(UnitConverter.KILOGRAM, 1000.0);
//        boolean add = length1.compare(length1, length);
//        Assert.assertTrue(add);
//    }
//
//    @Test
//    public void given1TonneAnd1000Grams_ShouldReturn1001kg() {
//        Length length1 = new Length(UnitConverter.TONNES, 1.0);
//        Length length = new Length(UnitConverter.GRAMS, 1000.0);
//        double value = length.addTwoLength(length1, length, UnitConverter.KILOGRAM);
//        Assert.assertEquals(1001.0,value,0.0);
//    }
//}
