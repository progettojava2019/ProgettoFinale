package Evoluzione;

import Grafica.CostruisciGrafico;
import Utility.Matrice;

import static Utility.Dati.*;
import static Utility.Dati.matriceMaschi;

public class CrescitaFigli {


    public CrescitaFigli() {

        if (matriceFigli.getnRigheComplete() > 0) {
            crescita(matriceFigli);
        } else {
            nuovaEra = true;
        }
        new CostruisciGrafico();
    }


    public void crescita (Matrice figli){

        for (int i = 0; i < figli.getnRigheComplete(); i++){
            double random = Math.random();
            if(random <= 0.5) {
                matriceFemmine.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
            else{
                matriceMaschi.addRiga(figli.getElement(i, 0), figli.getElement(i, 1));
            }
        }
    }
}
