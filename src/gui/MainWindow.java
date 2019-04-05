package gui;

import functions.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainWindow {
    public JPanel mainPanel;
    private JTabbedPane functionPanel;
    private JPanel temperaturePanel;
    private JPanel lengthPanel;
    private JPanel weightPanel;
    private JPanel speedPanel;
    private JPanel timePanel;
    private JPanel volumePanel;
    private JTextField TemperatureTextFieldFrom;
    private JTextField TemperatureTextFieldTo;
    private JList TemperatureListFrom;
    private JList TemperatureListTo;
    private JLabel TemperatureFromLabel;
    private JLabel TemperatureToLabel;
    private JLabel summaryLabel;
    private JLabel footerLabel;
    private JLabel LengthFromLabel;
    private JLabel LengthToLabel;
    private JList LengthListFrom;
    private JList LengthListTo;
    private JTextField LengthTextFieldTo;
    private JTextField LengthTextFieldFrom;
    private JPanel LengthContentPanel;
    private JPanel WeightContentPanel;
    private JLabel WeightFromLabel;
    private JTextField WeightTextFieldFrom;
    private JLabel WeightToLabel;
    private JTextField WeightTextFieldTo;
    private JList WeightListTo;
    private JList WeightListFrom;
    private JPanel SpeedContentPanel;
    private JLabel SpeedFromLabel;
    private JTextField SpeedTextFieldFrom;
    private JLabel SpeedToLabel;
    private JTextField SpeedTextFieldTo;
    private JList SpeedListTo;
    private JList SpeedListFrom;
    private JPanel TimeContentPanel;
    private JLabel TimeFromLabel;
    private JTextField TimeTextFieldFrom;
    private JLabel TimeToLabel;
    private JTextField TimeTextFieldTo;
    private JList TimeListTo;
    private JList TimeListFrom;
    private JPanel VolumeContentPanel;
    private JLabel VolumeFromLabel;
    private JTextField VolumeTextFieldFrom;
    private JLabel VolumeToLabel;
    private JTextField VolumeTextFieldTo;
    private JList VolumeListTo;
    private JList VolumeListFrom;
    private static double input;
    private static String fromUnit;
    private static String toUnit;
    private static double output;
    private static DecimalFormat df = new DecimalFormat("##0.###");

    public MainWindow() {
        df.setMaximumFractionDigits(8);

        //Temperature
        TemperatureTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((TemperatureTextFieldFrom.getText()));
                fromUnit = (String) TemperatureListFrom.getSelectedValue();
                toUnit = (String) TemperatureListTo.getSelectedValue();
                output = Temperature.calculate(input, fromUnit, toUnit);
                TemperatureTextFieldTo.setText(df.format(output));
                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        TemperatureListFrom.addListSelectionListener(e -> {
            fromUnit = (String) TemperatureListFrom.getSelectedValue();
            toUnit = (String) TemperatureListTo.getSelectedValue();
            input = Double.valueOf(TemperatureTextFieldFrom.getText());
            output = Temperature.calculate(input, fromUnit, toUnit);
            TemperatureTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        TemperatureListTo.addListSelectionListener(e -> {
            fromUnit = (String) TemperatureListFrom.getSelectedValue();
            toUnit = (String) TemperatureListTo.getSelectedValue();
            input = Double.valueOf(TemperatureTextFieldFrom.getText());
            output = Temperature.calculate(input, fromUnit, toUnit);
            TemperatureTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });

        //Length
        LengthTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((LengthTextFieldFrom.getText()));
                fromUnit = (String) LengthListFrom.getSelectedValue();
                toUnit = (String) LengthListTo.getSelectedValue();
                output = Length.calculate(input, fromUnit, toUnit);
                LengthTextFieldTo.setText(df.format(output));

                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        LengthListFrom.addListSelectionListener(e -> {
            input = Double.valueOf((LengthTextFieldFrom.getText()));
            fromUnit = (String) LengthListFrom.getSelectedValue();
            toUnit = (String) LengthListTo.getSelectedValue();
            output = Length.calculate(input, fromUnit, toUnit);
            LengthTextFieldTo.setText(df.format(output));

            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        LengthListTo.addListSelectionListener(e -> {
            input = Double.valueOf((LengthTextFieldFrom.getText()));
            fromUnit = (String) LengthListFrom.getSelectedValue();
            toUnit = (String) LengthListTo.getSelectedValue();
            output = Length.calculate(input, fromUnit, toUnit);
            //LengthTextFieldTo.setText(df.format(output));

            df.setMaximumFractionDigits(8);
            LengthTextFieldTo.setText(df.format(output));

            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });

        //Weight
        WeightTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((WeightTextFieldFrom.getText()));
                fromUnit = (String) WeightListFrom.getSelectedValue();
                toUnit = (String) WeightListTo.getSelectedValue();
                output = Weight.calculate(input, fromUnit, toUnit);
                WeightTextFieldTo.setText(df.format(output));
                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        WeightListFrom.addListSelectionListener(e -> {
            input = Double.valueOf((WeightTextFieldFrom.getText()));
            fromUnit = (String) WeightListFrom.getSelectedValue();
            toUnit = (String) WeightListTo.getSelectedValue();
            output = Weight.calculate(input, fromUnit, toUnit);
            WeightTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        WeightListTo.addListSelectionListener(e -> {
            input = Double.valueOf((WeightTextFieldFrom.getText()));
            fromUnit = (String) WeightListFrom.getSelectedValue();
            toUnit = (String) WeightListTo.getSelectedValue();
            output = Weight.calculate(input, fromUnit, toUnit);
            WeightTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });

        //Speed
        SpeedTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((SpeedTextFieldFrom.getText()));
                fromUnit = (String) SpeedListFrom.getSelectedValue();
                toUnit = (String) SpeedListTo.getSelectedValue();
                output = Speed.calculate(input, fromUnit, toUnit);
                SpeedTextFieldTo.setText(df.format(output));
                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        SpeedListFrom.addListSelectionListener(e -> {
            input = Double.valueOf((SpeedTextFieldFrom.getText()));
            fromUnit = (String) SpeedListFrom.getSelectedValue();
            toUnit = (String) SpeedListTo.getSelectedValue();
            output = Speed.calculate(input, fromUnit, toUnit);
            SpeedTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        SpeedListTo.addListSelectionListener(e -> {
            input = Double.valueOf((SpeedTextFieldFrom.getText()));
            fromUnit = (String) SpeedListFrom.getSelectedValue();
            toUnit = (String) SpeedListTo.getSelectedValue();
            output = Speed.calculate(input, fromUnit, toUnit);
            SpeedTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });

        //Time
        TimeTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((TimeTextFieldFrom.getText()));
                fromUnit = (String) TimeListFrom.getSelectedValue();
                toUnit = (String) TimeListTo.getSelectedValue();
                output = Time.calculate(input, fromUnit, toUnit);
                TimeTextFieldTo.setText(df.format(output));
                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        TimeListFrom.addListSelectionListener(e -> {
            input = Double.valueOf((TimeTextFieldFrom.getText()));
            fromUnit = (String) TimeListFrom.getSelectedValue();
            toUnit = (String) TimeListTo.getSelectedValue();
            output = Time.calculate(input, fromUnit, toUnit);
            TimeTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        TimeListTo.addListSelectionListener(e -> {
            input = Double.valueOf((TimeTextFieldFrom.getText()));
            fromUnit = (String) TimeListFrom.getSelectedValue();
            toUnit = (String) TimeListTo.getSelectedValue();
            output = Time.calculate(input, fromUnit, toUnit);
            TimeTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        //Volume
        VolumeTextFieldFrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                input = Double.valueOf((VolumeTextFieldFrom.getText()));
                fromUnit = (String) VolumeListFrom.getSelectedValue();
                toUnit = (String) VolumeListTo.getSelectedValue();
                output = Volume.calculate(input, fromUnit, toUnit);
                VolumeTextFieldTo.setText(df.format(output));
                summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
            }
        });
        VolumeListFrom.addListSelectionListener(e -> {
            input = Double.valueOf((VolumeTextFieldFrom.getText()));
            fromUnit = (String) VolumeListFrom.getSelectedValue();
            toUnit = (String) VolumeListTo.getSelectedValue();
            output = Volume.calculate(input, fromUnit, toUnit);
            VolumeTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
        VolumeListTo.addListSelectionListener(e -> {
            input = Double.valueOf((VolumeTextFieldFrom.getText()));
            fromUnit = (String) VolumeListFrom.getSelectedValue();
            toUnit = (String) VolumeListTo.getSelectedValue();
            output = Volume.calculate(input, fromUnit, toUnit);
            VolumeTextFieldTo.setText(df.format(output));
            summaryLabel.setText(input + " " + fromUnit + " = " + df.format(output) + " " + toUnit);
        });
    }


}
