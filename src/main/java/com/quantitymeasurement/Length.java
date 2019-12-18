package com.quantitymeasurement;

public class Length {

    public double value;
    public final Unit unit;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length l1, Length l2) {
        return this.unit.compare(l1, l2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || o == null)
            try {
                throw new MeasurementException("No values", MeasurementException.ExceptionType.NULL_VALUE);
            } catch (MeasurementException e) {
                e.printStackTrace();
            }
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public double addTwoLength(Length length1, Length length) {
        return this.unit.add(length1, length);
    }
}
