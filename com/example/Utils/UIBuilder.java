package com.example.Utils;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

    public static void addButtons(
            JButton[] functionButtons,
            JButton addButton,
            JButton subButton,
            JButton mulButton,
            JButton divButton,
            JButton decButton,
            JButton equButton,
            JButton delButton,
            JButton clrButton,
            JButton negButton) {

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
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

    public static void addToPanel(
            JPanel panel,
            JButton[] numberButtons,
            JButton addButton,
            JButton subButton,
            JButton mulButton,
            JButton decButton,
            JButton equButton,
            JButton divButton) {

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

    }

    public static void addToFrameAndSetVisibility(
            JFrame frame,
            JPanel panel,
            JButton negButton,
            JButton delButton,
            JButton clrButton,
            JTextField textField) {

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
        
    }
}
