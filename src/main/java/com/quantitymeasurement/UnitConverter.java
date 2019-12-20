package com.quantitymeasurement;

public enum UnitConverter {;

    enum LENGTH {
        FEET(30.48), INCH(2.54), YARD(91.44), RANDOM(0), CENTIMETERS(1.0);

        public final double unitConversion;

        LENGTH(double unitConversion) {
            this.unitConversion = unitConversion;
        }

    }

    enum VOLUME {
        GALLON(3785.41), LITER(1000.0), MILLI_LITRE(1.0);
        public final double unitConversion;

        VOLUME(double unitConversion) {
            this.unitConversion = unitConversion;
        }

    }

    enum WEIGHT {
        KILOGRAM(1000), GRAMS(1.0), TONNES(1000000.0);
        public final double unitConversion;

        WEIGHT(double unitConversion) {
            this.unitConversion = unitConversion;
        }
    }

    enum TEMPERATURE{
        CELSIUS(1.0),FAHRENHEIT(1.0);

        public final double unitConversion;

        TEMPERATURE(double unitConversion ) {
            this.unitConversion = unitConversion;

        }
    }
}


