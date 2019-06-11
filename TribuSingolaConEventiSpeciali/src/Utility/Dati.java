package Utility;

public final class Dati {

    public static final int gridHeigth = 300;
    public static final int gridWidth = 600;
    public final static int squareDimension = 10; //dimensioni del singolo quadratino della grglia


    public static int heigthSubGrid = (gridHeigth/6); //altezza di ciascuna porzione (1/4) della sottogriglia
    public static int widthSubGrid = 2 * heigthSubGrid; //larghezza di ciascuna porzione (1/4) della sottogriglia
    public static int SubjectNumber = 70; //numero massimo = heigthSubGrid/squareDimension * widthSubGrid/squareDimension

    public static boolean nuovaEra = false;


    public static double distanzaMassima = squareDimension * Math.sqrt(2); //distanza oltre la quale i soggetti non interagiscono tra loro


    /*  Inzializzo le matrice di Maschi, Femmine e Figli  */

    public final static Matrice matriceMaschi = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceFemmine = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceFigli = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceDonGiovanni = new Matrice(gridWidth*gridHeigth, 2);

    public final static Matrice matriceBoia = new Matrice(gridWidth*gridHeigth, 2);


}