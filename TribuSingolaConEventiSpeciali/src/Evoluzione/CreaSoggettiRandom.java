package Evoluzione;

import Utility.Matrice;
import Utility.MatriceSceriffo;
import Utility.Random;

import static Utility.Dati.*;

public class CreaSoggettiRandom {

    public Matrice creaSoggetti(Matrice mat, int numSoggetti) {

        MatriceSceriffo matriceSceriffo = new MatriceSceriffo();

        int subGridStartW = gridWidth / 2 - widthSubGrid;
        int subGridEndW = gridWidth / 2 + (widthSubGrid - squareDimension);
        int subGridStartH = gridHeigth / 2 - heigthSubGrid;
        int subGridEndH = gridHeigth / 2 + (heigthSubGrid - squareDimension);


        if(SubjectNumber > (widthSubGrid/squareDimension*heigthSubGrid/squareDimension)*4){
            System.out.println("ALERT!!! Sovraffolamento");
            System.exit(-1000);
        } else {

            for (int i = 0; i < numSoggetti; i++) {
                int x = new Random().randomizza(subGridStartW, subGridEndW);
                int y = new Random().randomizza(subGridStartH, subGridEndH);

                boolean controllore = true;
                controllore = new MatriceSceriffo().controlla(x, y, controllore);

                if (controllore) {
                    mat.addRiga(x, y);
                    matriceSceriffo.addRiga(x, y);
                } else {
                    //System.out.println("Sono uno sceriffo e ho fatto il mio lavoro");
                    i -= 1;
                }
            }
        }

        return mat;
    }
}
