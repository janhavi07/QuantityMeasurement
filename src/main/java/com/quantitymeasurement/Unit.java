package com.quantitymeasurement;

import java.text.DecimalFormat;

public enum Unit {
    FEET(30.48), INCH(2.54), YARD(91.44), RANDOM(0), CENTIMETERS(1.0);

    private final double unitConversion;
    private final static double DIVISION_FACTOR =2.54;

    Unit(double unitConversion) {
        this.unitConversion = unitConversion;
    }

    public boolean compare(Length l1, Length l2) {
        return Double.compare(l1.value * l1.unit.unitConversion, l2.value * l2.unit.unitConversion) == 0;
    }

    public double add(Length l1, Length l2) {
        DecimalFormat f = new DecimalFormat("##.00");
        double value = ((l1.value * l1.unit.unitConversion) + (l2.value * l2.unit.unitConversion))/ DIVISION_FACTOR;
        return Double.parseDouble(f.format(value));
    }
}
