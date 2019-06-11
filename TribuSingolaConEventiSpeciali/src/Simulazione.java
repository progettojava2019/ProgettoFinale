import Evoluzione.*;

import static Utility.Dati.*;


public class Simulazione extends Thread{

    public Simulazione() {

        System.out.println("Creazione popolazione");
        new CreaGenZero();

        Thread t = new Thread(this, "Primo Thread");
        t.run();
    }



    @Override
    public void run(){
        try {

            while (true) {

                System.out.println("Interazione tra maschi e femmine");
                //System.out.println("Larghezza subGrid = " + widthSubGrid);
                //System.out.println("Altezza subGrid = " + heigthSubGrid);
                new InterazioneInterSex();
                Thread.sleep(150);

                System.out.println("Interazione tra maschi e tra femmine");
                new InterazioneIntraSex();
                Thread.sleep(150);

                System.out.println("Crescita figli");
                new CrescitaFigli();
                if (matriceFigli.getnRigheComplete() > 0){
                    Thread.sleep(150);
                    matriceFigli.clearMatrice();
                }

                if(nuovaEra){

                    System.out.println("Ingresso donGiovanni");
                    new IngressiSpeciali().donGiovanni();
                    Thread.sleep(150);

                    System.out.println("Ingresso Boia");
                    new IngressiSpeciali().boia();
                    Thread.sleep(150);

                    nuovaEra = false;
                }



                if(matriceDonGiovanni.getnRigheComplete() != 0){
                    System.out.println("Interazione tra DonGiovanni e femmine");
                    new InterazioniSpeciali().effettoDonGiovanni();
                    Thread.sleep(300);
                }

                if(matriceBoia.getnRigheComplete() != 0){
                    System.out.println("Interazione tra Boia e Soggetti");
                    new InterazioniSpeciali().effettoBoia();
                    Thread.sleep(300);
                }

            }

        } catch (Exception e) {
            System.out.println("Thread ha lanciato un'eccezione");
        }

    }



}
