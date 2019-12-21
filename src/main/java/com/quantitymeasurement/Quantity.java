package com.quantitymeasurement;

public class Quantity {

    public UnitConverter.TEMPERATURE temperature;
    public UnitConverter.WEIGHT weight;
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

    public Quantity(UnitConverter.WEIGHT weight, double value) {
        this.weight = weight;
        this.value = value;
        this.unit = weight.unitConversion;
    }

    public Quantity(UnitConverter.TEMPERATURE temperature, double value) {
        this.temperature = temperature;
        this.value = value;
        if (temperature.equals(UnitConverter.TEMPERATURE.CELSIUS))
            this.unit = 1.8 * value + 32;
        if (temperature.equals(UnitConverter.TEMPERATURE.FAHRENHEIT))
            this.unit = (value - 32) * 5 / 9;
    }

    public boolean compare(Quantity l1, Quantity l2) {
        return l1.equals(l2);
    }

    public double addTwoLength(Quantity length1, Quantity length, double baseValue) {
        return measurement.add(length1, length, baseValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return (Double.compare(quantity.unit, unit) == 0 &&
                Double.compare(quantity.value, value) == 0 &&
                temperature == quantity.temperature &&
                weight == quantity.weight &&
                length == quantity.length &&
                volume == quantity.volume) ||
                measurement.compare(this, quantity);
    }
}
