package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length length = new Length(Length.Unit.FEET,0.0);
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length, length1);
    }

    @Test
    public void given1FeetAnd2Feet_ShouldReturnNotEqual() {
        Length length = new Length(Length.Unit.FEET,0.8);
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(length, length1);
    }

    @Test
    public void given0inchAnd0Inch_ShouldReturnEquals() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0inchAnd2Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.1);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1InchShouldReturnNotEquals() {
        Length length1=new Length(Length.Unit.FEET,1.0);
        Length length2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(length1,length2);
    }
}
