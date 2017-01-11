package com.company;

import javax.swing.*;
import java.awt.*;

public class themeClairBouton extends JButton{
    public themeClairBouton(String text){
        super(text);
        this.setForeground(Color.DARK_GRAY);
        this.setBackground(Color.LIGHT_GRAY);
    }
}
