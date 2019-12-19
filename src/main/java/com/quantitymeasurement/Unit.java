package com.quantitymeasurement;

import java.text.DecimalFormat;

public enum Unit {
    FEET(30.48), INCH(2.54), YARD(91.44), RANDOM(0), CENTIMETERS(1.0),
    GALLON(3785.41), LITER(1000.0), MILLI_LITRE(1),
    KILOGRAM(1000),GRAMS(1.0),TONNES(1000000);


    private final double unitConversion;
    DecimalFormat f = new DecimalFormat("##.00");

    Unit(double unitConversion) {
        this.unitConversion = unitConversion;
    }

    public boolean compare(Length l1, Length l2) {
        return Double.compare(Double.parseDouble(f.format(l1.value * l1.unit.unitConversion)), Double.parseDouble(f.format(l2.value * l2.unit.unitConversion))) == 0;
    }

    public double add(Length l1, Length l2, Unit baseValue) {
        double value = ((l1.value * l1.unit.unitConversion) + (l2.value * l2.unit.unitConversion)) / baseValue.unitConversion;
        return Double.parseDouble(f.format(value));
    }
}

