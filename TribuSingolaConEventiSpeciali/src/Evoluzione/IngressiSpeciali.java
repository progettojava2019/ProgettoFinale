package Evoluzione;

import Grafica.CostruisciGrafico;

import static Utility.Dati.*;

public class IngressiSpeciali {


    public void donGiovanni(){

        int numeroDonGiovanni = Math.round(matriceFemmine.getnRigheComplete())/5;

        for(int i = 0; i < numeroDonGiovanni; i++) {
            int nuovoDonGiovanniX = (matriceFemmine.getElement(i,0) + squareDimension);
            int nuovoDonGiovanniY = matriceFemmine.getElement(i,1);
            matriceDonGiovanni.addRiga(nuovoDonGiovanniX, nuovoDonGiovanniY);
        }

        new CostruisciGrafico();
    }



    public void boia(){

        int numeroSoggetti = matriceMaschi.getnRigheComplete() + matriceFemmine.getnRigheComplete();
        int numeroBoia = Math.round(numeroSoggetti/10);

        int n1 = matriceMaschi.getnRigheComplete() - 1;
        for(int j = 0; j < numeroBoia; j++) {
            int nuovoBoiaX = (matriceMaschi.getElement(n1-j,0)) + squareDimension;
            int nuovoBoiaY = (matriceMaschi.getElement(n1-j,1));
            matriceBoia.addRiga(nuovoBoiaX, nuovoBoiaY);
        }

        new CostruisciGrafico();
    }



}

