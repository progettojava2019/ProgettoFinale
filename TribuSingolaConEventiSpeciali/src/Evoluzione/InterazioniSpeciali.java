package Evoluzione;

import Grafica.CostruisciGrafico;
import Utility.CalcolaDistanze;
import Utility.Matrice;

import static Utility.Dati.*;

public class InterazioniSpeciali {


    public void effettoDonGiovanni(){

        nascitaGemelli();

        new CostruisciGrafico();

    }


    public void effettoBoia(){

        carneficina(matriceMaschi, matriceBoia);
        carneficina(matriceFemmine, matriceBoia);

        new CostruisciGrafico();
    }


    public void nascitaGemelli(){

        Matrice mat1 = matriceFemmine;
        Matrice mat2 = matriceDonGiovanni;

        for(int i = 0; i < mat1.getnRigheComplete(); i++) {

            for (int j = 0; j < mat2.getnRigheComplete(); j++) {

                float distanza = new CalcolaDistanze().distanza(mat1.getElement(i,0), mat1.getElement(i,1), mat2.getElement(j,0), mat2.getElement(j,1));

                if (distanza < distanzaMassima) {
                    Matrice gemelli = new Matrice(2,2);
                    gemelli = new CreaSoggettiRandom().creaSoggetti(gemelli, 2);
                    matriceFigli.addRiga(gemelli.getElement(0,0), gemelli.getElement(0,1));
                    matriceFigli.addRiga(gemelli.getElement(1,0), gemelli.getElement(1,1));
                }

            }
        }

        matriceDonGiovanni.clearMatrice();
    }



    public void carneficina(Matrice mat1, Matrice mat2){


        for(int k = 0; k < mat1.getnRigheComplete(); k++) {

            for (int kk = 0; kk < mat2.getnRigheComplete(); kk++) {

                float distanza = new CalcolaDistanze().distanza(mat1.getElement(k,0), mat1.getElement(k,1), mat2.getElement(kk,0), mat2.getElement(kk,1));

                if (distanza < distanzaMassima) {
                    mat1.removeRiga(k);
                }

            }
        }

        matriceBoia.clearMatrice();
    }
}
