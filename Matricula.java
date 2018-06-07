import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public static final int PREUPERCREDIT = 15;
    public long id = 0;
    private Collection assignatures;

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        Estudiant.setNom(nom);
        Estudiant.setCognoms(cognoms);
        Estudiant.setDni(dni);
        Estudiant.setCurs(curs);
        this.assignatures = assignatures;
    }

    public float costMatricula(){

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * PREUPERCREDIT;
        return cost;
    }

}