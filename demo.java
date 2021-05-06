package Project2021;

import Project2021.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public abstract class demo implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userlabel;
    private  static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;

    public static void main(String[] args) {

         frame = new JFrame("Movie Project");
         panel = new JPanel();


      panel.setBackground(MAGENTA);
        frame.setSize(250, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        userlabel = new JLabel("User");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

         userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

         passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        button = new JButton("Login");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = userText.getText();
                String password = passwordText.getText();
                if (user.equals("Alissa") && password.equals("1111")) {
                    if (e.getSource() == button) {
                        new Thread() {
                            @Override
                            public void run() {
                                demo2 Window = new demo2();
                            }
                        }.start();


                    }}
            }
        };
        button.addActionListener(listener);
        button.setBounds(10, 80, 80, 25);
        panel.add(button);


        frame.setVisible(true);



    }


    }

