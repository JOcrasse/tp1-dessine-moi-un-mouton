import java.util.List;
import java.util.LinkedList;

public abstract class PanneauObservable {

    private List<ObserveurPanneau> aPanneaux;

    public PanneauObservable() {
        aPanneaux = new LinkedList<ObserveurPanneau>();
    }

    public void attache(ObserveurPanneau aPanneau) {
        aPanneaux.add(aPanneau);
    }

    public void detache(ObserveurPanneau aPanneau) {
        aPanneaux.remove(aPanneau);
    }

    protected void informe() {
        for(ObserveurPanneau laObserveur : aPanneaux) {
            laObserveur.actualisation(this);
        }
    }

}
