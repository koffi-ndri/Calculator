package com.example.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.example.Utils.ActionPerformer;
import com.example.Utils.UIBuilder;

public class CalculatorApp implements ActionListener {

    JFrame frame;
    public JTextField textField;
    JButton[] functionButtons = new JButton[9];
    public JButton[] numberButtons = new JButton[10];
    public JButton addButton, subButton, mulButton, divButton;
    public JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel; // holds all separation buttons

    Font font = new Font("Ink Free", Font.BOLD, 30);
    public double num1 = 0, num2 = 0, result = 0;
    public char operator;

    CalculatorApp() {

        frame = new JFrame("Calculator");
        textField = new JTextField();
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        negButton = new JButton("(-)");
        panel = new JPanel();

        UIBuilder.setFrameAndTextField(frame, textField, font);
        UIBuilder.addButtons(
                functionButtons, addButton, subButton, mulButton, divButton,
                decButton, equButton, delButton, clrButton, negButton);
        UIBuilder.setButtons(functionButtons, numberButtons, this, font);
        UIBuilder.setBoundsOf(negButton, delButton, clrButton);
        UIBuilder.setPanel(panel);
        UIBuilder.addToPanel(
                panel, numberButtons, addButton, subButton,
                mulButton, decButton, equButton, divButton);

        UIBuilder.addToFrameAndSetVisibility(
                frame, panel, negButton,
                delButton, clrButton, textField);
    }

    public static void main(String[] args) {
        CalculatorApp calculator = new CalculatorApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ActionPerformer.performNumberButtonsEvent(this, e);        
        ActionPerformer.performOperatorButtonsEvent(this, e);
        ActionPerformer.performEqualButtonEvent(this, e);
        ActionPerformer.performOtherButtonsEvent(this, e);        

    }
}