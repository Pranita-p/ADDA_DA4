package Pranita;

import javax.swing.*;

public class UnitConverterForm {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Unit Converter");
            frame.setSize(400, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            UnitConverterUI.placeComponents(panel);

            frame.setVisible(true);
        });
    }
}
