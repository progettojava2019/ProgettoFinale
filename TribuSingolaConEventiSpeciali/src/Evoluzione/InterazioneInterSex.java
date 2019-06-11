package Evoluzione;

import Grafica.CostruisciGrafico;
import Utility.CalcolaDistanze;
import Utility.Matrice;

import static Utility.Dati.*;


public class InterazioneInterSex {

    public InterazioneInterSex(){

        nascitaFigli();

        new CostruisciGrafico();
    }


    public void nascitaFigli(){

        Matrice m = matriceMaschi;
        Matrice f = matriceFemmine;

        if(widthSubGrid + squareDimension < (gridWidth)/2)
            widthSubGrid += 2 * squareDimension;
        if(heigthSubGrid + squareDimension < (gridHeigth)/2)
            heigthSubGrid += squareDimension;


        for(int i = 0; i < m.getnRigheComplete(); i++) {

            for (int j = 0; j < f.getnRigheComplete(); j++) {

                float distanzaMF = new CalcolaDistanze().distanza(m.getElement(i,0), m.getElement(i,1), f.getElement(j,0), f.getElement(j,1));

                if (distanzaMF < distanzaMassima) {

                    matriceFigli.addRiga(f.getElement(j,0), f.getElement(j,1));

                    Matrice nuovoMaschio = new Matrice(1,2);
                    nuovoMaschio = new CreaSoggettiRandom().creaSoggetti(nuovoMaschio, 1);
                    matriceMaschi.sosituisciRiga(nuovoMaschio, i);

                    Matrice nuovaFemmina = new Matrice(1,2);
                    nuovaFemmina = new CreaSoggettiRandom().creaSoggetti(nuovaFemmina, 1);
                    matriceFemmine.sosituisciRiga(nuovaFemmina, j);
                }
            }
        }

    }
}
