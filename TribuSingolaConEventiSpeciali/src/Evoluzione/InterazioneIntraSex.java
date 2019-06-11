package Evoluzione;

import Grafica.CostruisciGrafico;
import Utility.CalcolaDistanze;
import Utility.Matrice;

import static Utility.Dati.*;

public class InterazioneIntraSex {

    public InterazioneIntraSex(){

        lottaSoggetti(matriceMaschi, "Maschi");
        lottaSoggetti(matriceFemmine, "Femmine");

        new CostruisciGrafico();
    }


    public void lottaSoggetti(Matrice mat, String s){
        for(int i = 0; i < mat.getnRigheComplete(); i++) {
            for (int j = 0; j < mat.getnRigheComplete(); j++) {

                float distanza = new CalcolaDistanze().distanza(
                        mat.getElement(i,0), mat.getElement(i,1), mat.getElement(j,0), mat.getElement(j,1));

                if(i != j && distanza < distanzaMassima){

                    if(s.equals("Maschi")){
                        matriceMaschi.removeRiga(i);
                        matriceMaschi.removeRiga(j-1);
                        i -= 1;
                        break;
                    }
                    else{
                        matriceFemmine.removeRiga(i);
                        matriceFemmine.removeRiga(j-1);
                        i -= 1;
                        break;
                    }

                }

            }
        }
    }

}
