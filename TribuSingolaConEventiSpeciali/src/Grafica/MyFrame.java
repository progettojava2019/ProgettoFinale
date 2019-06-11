package Grafica;

import javax.swing.*;
import java.awt.*;

import static Utility.Dati.gridHeigth;
import static Utility.Dati.gridWidth;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.dispose();
        this.setBounds(0, 0, 500, 100);
        this.setMinimumSize(new Dimension(500, 100));
    }

    public MyFrame(String titolo) {
        super(titolo);
        this.dispose();
        this.setBounds(100, 50, gridWidth + 10, gridHeigth + 50);
        this.setMinimumSize(new Dimension(gridWidth + 20, gridHeigth + 20));
    }

}
