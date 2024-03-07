package Pranita;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class UnitConverterTest {
	
	private UnitConverter unitConverter;

    @Before
    public void setUp() {
        System.out.println("Setting up for the test enviroment ,initialising resources");
        unitConverter = new UnitConverter();
    }
    
    @Test
    public void testValidConversion_CmToMeters() {
        double result = UnitConverter.performUnitConversion(100, "Centimeters", "Meters");
        assertEquals(1.0, result, 0.01);
    }


    @Test
    public void testValidConversion_CmToInches() {
        double result = UnitConverter.performUnitConversion(100, "Centimeters", "Inches");
        assertEquals(39.37, result, 0.01);
    }

    

    @Test
    public void testValidConversion_CmToKilometers() {
        double result = UnitConverter.performUnitConversion(100000, "Centimeters", "Kilometers");
        assertEquals(1.0, result, 0.01);
    }
    


    @Test
    public void testInvalidConversion_InvalidUnit() {
        double result = UnitConverter.performUnitConversion(100, "InvalidUnit", "Meters");
        assertEquals(-1, result, 0.01);
    }
    


    @Test
    public void testInvalidConversion_NegativeValue() {
        double result = UnitConverter.performUnitConversion(-100, "Centimeters", "Meters");
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_NullFromUnit() {
        double result = UnitConverter.performUnitConversion(100, null, "Meters");
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_NullToUnit() {
        double result = UnitConverter.performUnitConversion(100, "Centimeters", null);
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_EmptyFromUnit() {
        double result = UnitConverter.performUnitConversion(100, "", "Meters");
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_EmptyToUnit() {
        double result = UnitConverter.performUnitConversion(100, "Centimeters", "");
        assertEquals(-1, result, 0.01);
    }
    
    @Test
    public void testInvalidConversion_SameUnits() {
        double result = UnitConverter.performUnitConversion(100, "Centimeters", "Centimeters");
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_ZeroValue() {
        double result = UnitConverter.performUnitConversion(0, "Centimeters", "Meters");
        assertEquals(0, result, 0.01);
    }

    

    @Test
    public void testInvalidConversion_MissingFromUnit() {
        double result = UnitConverter.performUnitConversion(100, null, "Inches");
        assertEquals(-1, result, 0.01);
    }

    @Test
    public void testInvalidConversion_MissingToUnit() {
        double result = UnitConverter.performUnitConversion(100, "Meters", "");
        assertEquals(-1, result, 0.01);
    }
    
    @After
    public void tearDown() {
        System.out.println("Releasing resources after the test");
        unitConverter = null;
    }
}

