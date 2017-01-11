package com.company;

import javax.swing.*;
import java.awt.*;

public class ThemeClair extends JButton{
    public JButton createButton(String text){
        JButton boutonClair = new themeClairBouton(text);
        return boutonClair;
    }
}
