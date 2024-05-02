package com.example.Main;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import com.example.Utils.ActionPerformer;
import com.example.Utils.UIBuilder;

public class CalculatorApp implements ActionListener {

    public JFrame frame;
    public JTextField textField;
    public JButton[] functionButtons = new JButton[9];
    public JButton[] numberButtons = new JButton[10];
    public JButton addButton, subButton, mulButton, divButton;
    public JButton decButton, equButton, delButton, clrButton, negButton;
    public JPanel panel; // holds all separation buttons

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
        UIBuilder.addButtons(this);
        UIBuilder.setButtons(functionButtons, numberButtons, this, font);
        UIBuilder.setBoundsOf(negButton, delButton, clrButton);
        UIBuilder.setPanel(panel);
        UIBuilder.addToPanel(this);
        UIBuilder.addToFrameAndSetVisibility(this);
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