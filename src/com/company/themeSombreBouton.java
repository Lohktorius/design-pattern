package com.company;

import javax.swing.*;
import java.awt.*;

public class themeSombreBouton extends JButton{
    public themeSombreBouton(String text){
        super(text);
        this.setForeground(Color.DARK_GRAY);
        this.setBackground(Color.BLACK);
    }
}