package Grafica;

import static Utility.Dati.*;

public class CostruisciGrafico {

    public static MyFrame frame = new MyFrame("Sviluppo popolazione");
    private MostraGrafico grafico = new MostraGrafico();

    public CostruisciGrafico() {

        grafico.riempiGrafico(matriceMaschi, "Maschi", frame);

        grafico.riempiGrafico(matriceFemmine, "Femmine", frame);

        if(matriceFigli.getnRigheComplete() !=0)
            grafico.riempiGrafico(matriceFigli, "Figli", frame);

        if(matriceDonGiovanni.getnRigheComplete() !=0)
            grafico.riempiGrafico(matriceDonGiovanni, "Don Giovanni", frame);

        if(matriceBoia.getnRigheComplete() !=0)
            grafico.riempiGrafico(matriceBoia, "Boia", frame);

    }
}
