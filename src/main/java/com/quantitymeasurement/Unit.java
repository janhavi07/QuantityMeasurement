package com.quantitymeasurement;

public enum Unit {
    FEET(12.0),INCH(1.0),YARD(36.0),RANDOM(0),CENTIMETERS(2.54);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public boolean compare(Length l1, Length l2) {
        return Double.compare(l1.value*l1.unit.conversionFactor, l2.value*l2.unit.conversionFactor) == 0;
    }
}
