package com.company;

import javax.swing.*;
import java.awt.*;

public class ThemeSombre extends JButton {
    public JButton createButton(String text){
        JButton boutonSombre = new themeSombreBouton(text);
        return boutonSombre;
    }
}
