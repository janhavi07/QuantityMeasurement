package com.quantitymeasurement;

import java.text.DecimalFormat;

public class Measurement {
    DecimalFormat f = new DecimalFormat("##.00");
    public boolean compare(Quantity l1, Quantity l2) {
        return Double.compare(Double.parseDouble(f.format(l1.value * l1.unit)),
                Double.parseDouble(f.format(l2.value * l2.unit))) == 0;
    }

    public double add(Quantity l1, Quantity l2, double baseValue) {
        double value = ((l1.value * l1.unit) + (l2.value * l2.unit)) / baseValue;
        return Double.parseDouble(f.format(value));
    }
}
