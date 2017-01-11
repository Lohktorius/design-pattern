package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    static JButton button;
    public static void main(String[] args) {
        JFrame j = new JFrame("Thèmes");
        JPanel pan = new JPanel();

        j.setSize(new Dimension(400, 150));
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setContentPane(pan);

        JComboBox combo = new JComboBox();
        combo.addItem("Thème Clair");
        combo.addItem("Thème Sombre");
        pan.add(new JLabel("Choisissez le thème du Bouton : "));
        pan.add(combo);
        button = new ThemeClair().createButton("Thème Clair");
        pan.add(button);

        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(!e.equals(button)){
                    pan.remove(button);
                    if(e.getItem().equals("Thème Sombre")){
                        button = new ThemeSombre().createButton("Thème Sombre");
                        pan.add(button);
                    }
                    else{
                        button = new ThemeClair().createButton("Thème Clair");
                        pan.add(button);
                    }
                    pan.repaint();
                    pan.revalidate();
                }
            }
        });

        j.setVisible(true);
    }
}
