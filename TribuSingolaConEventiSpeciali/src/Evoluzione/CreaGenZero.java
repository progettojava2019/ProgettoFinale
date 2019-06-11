package Evoluzione;

import Grafica.CostruisciGrafico;

import static Utility.Dati.*;

public class CreaGenZero {


    public CreaGenZero(){

        int numMaschiIniziali = SubjectNumber/2;
        int numFemmineIniziali = SubjectNumber/2;

        CreaSoggettiRandom crea = new CreaSoggettiRandom();

        crea.creaSoggetti(matriceMaschi, numMaschiIniziali);
        crea.creaSoggetti(matriceFemmine, numFemmineIniziali);

        new CostruisciGrafico();

    }


}
