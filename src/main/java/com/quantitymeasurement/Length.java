package com.quantitymeasurement;

public class Length {
//    private static final double FEET_INTO_INCH = 12.0;
//    private static final double YARD_TO_FEET = 3.0;
//    private static final double YARD_TO_INCH = 36.0;


    public double value;
    public final Unit unit;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length l1,Length l2) {
       return this.unit.compare(l1,l2);
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
}
