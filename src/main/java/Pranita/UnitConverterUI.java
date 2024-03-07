package Pranita;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverterUI {

    static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        panel.setBackground(new Color(255, 229, 180)); // Set background color

        JLabel valueLabel = new JLabel("Value:");
        valueLabel.setBounds(10, 20, 80, 25);
        valueLabel.setForeground(Color.BLACK); // Set text color
        panel.add(valueLabel);

        JTextField valueText = new JTextField(20);
        valueText.setBounds(100, 20, 165, 25);
        panel.add(valueText);

        JLabel fromUnitLabel = new JLabel("From Unit:");
        fromUnitLabel.setBounds(10, 50, 150, 25);
        fromUnitLabel.setForeground(Color.BLACK);
        panel.add(fromUnitLabel);

        JComboBox<String> fromUnitChoice = new JComboBox<>(ConversionFactors.getAvailableUnits());
        fromUnitChoice.setBounds(150, 50, 150, 25);
        panel.add(fromUnitChoice);

        JLabel toUnitLabel = new JLabel("To Unit:");
        toUnitLabel.setBounds(10, 80, 150, 25);
        toUnitLabel.setForeground(Color.BLACK);
        panel.add(toUnitLabel);

        JComboBox<String> toUnitChoice = new JComboBox<>(ConversionFactors.getAvailableUnits());
        toUnitChoice.setBounds(150, 80, 150, 25);
        panel.add(toUnitChoice);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(10, 110, 100, 25);
        convertButton.setBackground(new Color(105, 105, 105)); // Set button background color
        convertButton.setForeground(Color.BLACK); // Set button text color
        panel.add(convertButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(120, 110, 250, 25);
        resultLabel.setForeground(Color.BLACK);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.parseDouble(valueText.getText());
                    String fromUnit = (String) fromUnitChoice.getSelectedItem();
                    String toUnit = (String) toUnitChoice.getSelectedItem();

                    // Perform unit conversion based on fromUnit and toUnit
                    double result = UnitConverter.performUnitConversion(value, fromUnit, toUnit);

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter a valid number.");
                }
            }
        });
    }
}
