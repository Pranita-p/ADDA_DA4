package Pranita;

public class UnitConverter {

    static double performUnitConversion(double value, String fromUnit, String toUnit) {
        // Check if conversion factors are available
        if (ConversionFactors.hasConversionFactor(fromUnit) && ConversionFactors.hasConversionFactor(toUnit)) {
            double conversionFactorFrom = ConversionFactors.getConversionFactor(fromUnit);
            double conversionFactorTo = ConversionFactors.getConversionFactor(toUnit);
            return value * (conversionFactorTo / conversionFactorFrom);
        } else {
            // Handle unsupported unit conversion
            return -1;
        }
    }
}