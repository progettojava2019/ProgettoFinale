package Grafica;

import Soggetti.Soggetto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Utility.Dati.*;
import static Utility.Dati.heigthSubGrid;


public class Pannello extends JPanel {

    private List<Soggetto> soggetto;

    public Pannello() {
        soggetto = new ArrayList<>();

    }

    public void add(Soggetto s){
        soggetto.add(s);
        repaint();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);

        //linee verticali della griglia
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i <= gridWidth; i += squareDimension) {
            g.drawLine(i, 0, i, gridHeigth);
        }
        //linee orizzontali della griglia
        for (int j = 0; j <= gridHeigth; j += squareDimension) {
            g.drawLine(0, j, gridWidth, j);
        }

        //Disegna i soggetti
        for (int i = 0; i < soggetto.size(); i++){
            soggetto.get(i).Disegna(g);
        }


    }

}

