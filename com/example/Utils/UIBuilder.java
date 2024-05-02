package com.example.Utils;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.example.Main.CalculatorApp;

public class UIBuilder {

    public static void setFrameAndTextField(
            JFrame frame,
            JTextField textField,
            Font font) {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will allow us to close the program when clicking
                                                              // on exit button
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);
    }

    public static void addButtons(CalculatorApp app) {

        app.functionButtons[0] = app.addButton;
        app.functionButtons[1] = app.subButton;
        app.functionButtons[2] = app.mulButton;
        app.functionButtons[3] = app.divButton;
        app.functionButtons[4] = app.decButton;
        app.functionButtons[5] = app.equButton;
        app.functionButtons[6] = app.delButton;
        app.functionButtons[7] = app.clrButton;
        app.functionButtons[8] = app.negButton;
    }

    public static void setButtons(
            JButton[] functionButtons,
            JButton[] numberButtons,
            ActionListener listener,
            Font font) {

        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].setFont(font);
            functionButtons[i].addActionListener(listener);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(font);
            numberButtons[i].addActionListener(listener);
            numberButtons[i].setFocusable(false);
        }

    }

    public static void setBoundsOf(
            JButton negativeButton,
            JButton deleteButton,
            JButton clearButton) {
        negativeButton.setBounds(50, 430, 100, 50);
        deleteButton.setBounds(150, 430, 100, 50);
        clearButton.setBounds(250, 430, 100, 50);
    }

    public static void setPanel(JPanel panel) {
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
    }

    public static void addToPanel(CalculatorApp app) {

        app.panel.add(app.numberButtons[1]);
        app.panel.add(app.numberButtons[2]);
        app.panel.add(app.numberButtons[3]);
        app.panel.add(app.addButton);
        app.panel.add(app.numberButtons[4]);
        app.panel.add(app.numberButtons[5]);
        app.panel.add(app.numberButtons[6]);
        app.panel.add(app.subButton);
        app.panel.add(app.numberButtons[7]);
        app.panel.add(app.numberButtons[8]);
        app.panel.add(app.numberButtons[9]);
        app.panel.add(app.mulButton);
        app.panel.add(app.decButton);
        app.panel.add(app.numberButtons[0]);
        app.panel.add(app.equButton);
        app.panel.add(app.divButton);

    }

    public static void addToFrameAndSetVisibility(CalculatorApp app) {

        app.frame.add(app.panel);
        app.frame.add(app.negButton);
        app.frame.add(app.delButton);
        app.frame.add(app.clrButton);
        app.frame.add(app.textField);
        app.frame.setVisible(true);
        
    }
}
