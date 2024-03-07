package Pranita;

import java.util.HashMap;
import java.util.Map;

public class ConversionFactors {

    private static Map<String, Double> conversionFactors = new HashMap<>();

    static {
        
        conversionFactors.put("Centimeters", 1.0);
        conversionFactors.put("Meters", 0.01);
        conversionFactors.put("Inches", 0.3937);
        conversionFactors.put("Kilometers", 1e-5);
    }

    static double getConversionFactor(String unit) {
        return conversionFactors.getOrDefault(unit, -1.0);
    }

    static boolean hasConversionFactor(String unit) {
        return conversionFactors.containsKey(unit);
    }

    static String[] getAvailableUnits() {
       
        return conversionFactors.keySet().toArray(new String[0]);
    }
}

