package com.converter;

import javax.swing.*;
import java.awt.event.*;
import java.lang.String;

class Frame extends JFrame{
    Frame(String text,int width,int height) {
        super();
        setTitle(text);
        setBounds(0,0,width,height);
        setLayout(null);
        setVisible(true);
        new Button(this,true);
        setResizable(false);
    }
}

class Button extends JButton {
    Frame frame;

    Button(Frame frame, boolean state) {
        super();
        this.frame = frame;

        JButton button, button1, button2, button3, button4, button5, button6, button7, button8,
                button9, button10, button11, button12, button13, button14, button15, button16, button17, button18;
        final JTextField textField;

        textField = new JTextField();
        textField.setBounds(30, 30, 220, 50);
        textField.setText("0");
        ParsCurrency.loadCross();

        button10 = new JButton("For recent crosscoure");
        button10.setBounds(30, 100, 340, 50);
        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = ParsCurrency.loadCross();
                textField.setText("0");
            }
        });

        button3 = new JButton("exit");
        button3.setBounds(270, 30, 100, 50);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button = new JButton("dollar/euro");
        button.setBounds(30, 340, 100, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getDolEu(d);
                textField.setText(s);

            }
        });
        button1 = new JButton("dollar/RUR");
        button1.setBounds(150, 340, 100, 50);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getDolRUR(d);
                textField.setText(s);
            }
        });

        button2 = new JButton("dollar/UAH");
        button2.setBounds(270, 340, 100, 50);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getDolUAH(d);
                textField.setText(s);
            }
        });


        button4 = new JButton("euro/dollar");
        button4.setBounds(30, 180, 100, 50);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getEuDol(d);
                textField.setText(s);
            }
        });

        button5 = new JButton("euro/RUR");
        button5.setBounds(150, 180, 100, 50);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getEuRUR(d);
                textField.setText(s);
            }
        });

        button6 = new JButton("PLN/dollar");
        button6.setBounds(270, 180, 100, 50);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                    double d = Double.parseDouble(textField.getText());
                    String s = ParsCurrency.getGBPDol(d);
                    textField.setText(s);
            }
        });

        button7 = new JButton("RUR/dollar");
        button7.setBounds(30, 260, 100, 50);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getRURDol(d);
                textField.setText(s);
            }
        });

        button8 = new JButton("RUR/euro");
        button8.setBounds(150, 260, 100, 50);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getRUREu(d);
                textField.setText(s);
            }
        });
        button9 = new JButton("UAH/dollar");
        button9.setBounds(270, 260, 100, 50);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText());
                String s = ParsCurrency.getUAHDol(d);
                textField.setText(s);
            }
        });

        button11 = new JButton("5");
        button11.setBounds(30, 410, 70, 50);
        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 5;
                textField.setText("" + d);
            }
        });

        button12 = new JButton("10");
        button12.setBounds(120, 410, 70, 50);
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 10;
                textField.setText("" + d);
            }
        });
        button13 = new JButton("20");
        button13.setBounds(210, 410, 70, 50);
        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 20;
                textField.setText("" + d);
            }
        });

        button14 = new JButton("50");
        button14.setBounds(300, 410, 70, 50);
        button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 50;
                textField.setText("" + d);
            }
        });

        button15 = new JButton("100");
        button15.setBounds(30, 480, 70, 50);
        button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 100;
                textField.setText("" + d);
            }
        });
        button16 = new JButton("200");
        button16.setBounds(120, 480, 70, 50);
        button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 200;
                textField.setText("" + d);
            }
        });
        button17 = new JButton("500");
        button17.setBounds(210, 480, 70, 50);
        button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(textField.getText()) + 500;
                textField.setText("" + d);
            }
        });

        button18 = new JButton("C");
        button18.setBounds(300, 480, 70, 50);
        button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);

    }

}


class Main {

    public static void main(String[] args) throws NumberFormatException {
            new Frame("Converter of currency", 420, 600);
    }
}