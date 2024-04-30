package com.example.Utils;
import java.awt.event.ActionEvent;
import com.example.Main.CalculatorApp;

public class ActionPerformer {

    public static void performNumberButtonsEvent(
            CalculatorApp app,
            ActionEvent event) {
        for (int i = 0; i < app.numberButtons.length; i++) {
            if (event.getSource() == app.numberButtons[i]) {
                app.textField.setText(app.textField.getText().concat(String.valueOf(i)));
            }
        }
    }

    public static void performOperatorButtonsEvent(CalculatorApp app, ActionEvent event) {
        if (event.getSource() == app.addButton) {
            parseOperator('+', app);
        }
        if (event.getSource() == app.subButton) {
            parseOperator('-', app);
        }
        if (event.getSource() == app.mulButton) {
            parseOperator('*', app);
        }
        if (event.getSource() == app.divButton) {
            parseOperator('/', app);
        }
    }

    public static void performEqualButtonEvent(CalculatorApp app, ActionEvent event) {
        if (event.getSource() == app.equButton) {
            if (app.textField.getText().equals("")) {
                return;
            }
            app.num2 = Double.parseDouble(app.textField.getText());

            switch (app.operator) {
                case '+':
                    app.result = app.num1 + app.num2;
                    break;
                case '-':
                    app.result = app.num1 - app.num2;
                    break;
                case '*':
                    app.result = app.num1 * app.num2;
                    break;
                case '/':
                    app.result = app.num1 / app.num2;
                    break;
            }
            app.textField.setText(String.valueOf(app.result));
            app.num1 = app.result;
        }
        if (event.getSource() == app.negButton) {
            double num = Double.parseDouble(app.textField.getText());
            num *= -1;
            app.textField.setText(String.valueOf(num));
        }
    }

    public static void performOtherButtonsEvent(CalculatorApp app, ActionEvent event) {
        if (event.getSource() == app.decButton) {
            app.textField.setText(app.textField.getText().concat("."));
        }
        if (event.getSource() == app.clrButton) {
            app.textField.setText("");
        }
        if (event.getSource() == app.delButton) {
            String string = app.textField.getText();
            app.textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                app.textField.setText(app.textField.getText().concat(String.valueOf(string.charAt(i))));
            }
        }
    }

    private static void parseOperator(char operator, CalculatorApp app) {
        app.num1 = Double.parseDouble(app.textField.getText());
        app.textField.setText("");
        app.operator = operator;
    }
}
