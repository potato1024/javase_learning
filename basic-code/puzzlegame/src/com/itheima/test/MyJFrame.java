package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("jbt1");
    JButton jbt2 = new JButton("jbt2");

    public MyJFrame() {
        this.setSize(603, 680);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        jbt1.setBounds(0, 0, 100, 50);
        jbt1.addActionListener(this);


        jbt2.setBounds(100, 0, 100, 50);
        jbt2.addActionListener(this);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == jbt1) {
            System.out.println("jbt1被点击了");
            jbt1.setSize(200, 200);
        } else if (source == jbt2) {
            System.out.println("jbt2被点击了");
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500),r.nextInt(500));


        }
    }
}


