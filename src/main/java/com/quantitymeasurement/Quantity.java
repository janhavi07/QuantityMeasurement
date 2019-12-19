package com.quantitymeasurement;

import java.util.Objects;

public class Quantity {

    public double unit;
    public UnitConverter.LENGTH length;
    public UnitConverter.VOLUME volume;
    public double value;

    Measurement measurement = new Measurement();

    public Quantity(UnitConverter.LENGTH length, double value) {
        this.length = length;
        this.value = value;
        this.unit = length.unitConversion;
    }

    public Quantity(UnitConverter.VOLUME volume, double value) {
        this.volume = volume;
        this.value = value;
        this.unit = volume.unitConversion;
    }


//
//    public Length(UnitConverter unitConverter, Double value) {
//        this.unitConverter = unitConverter;
//        this.value = value;
//    }

    public boolean compare(Quantity l1, Quantity l2) {
        return measurement.compare(l1, l2);
    }

    public double addTwoLength(Quantity length1, Quantity length, UnitConverter.LENGTH baseValue) {
        return measurement.add(length1, length, baseValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.unit, unit) == 0 &&
                Double.compare(quantity.value, value) == 0 &&
                length == quantity.length ||
                volume == quantity.volume &&
                        Objects.equals(measurement, quantity.measurement);
    }
}
