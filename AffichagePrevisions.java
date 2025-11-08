import java.util.Observable;
import java.util.Observer;

public class AffichagePrevisions implements Observer, Affichage {
    
    private float pressionActuelle = 1012;
    private float dernierePression;
    private Observable observable;
    
    public AffichagePrevisions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo)observable;
            this.dernierePression = this.pressionActuelle;
            this.pressionActuelle = donneesMeteo.getPression();
            afficher();
        }
    }

    @Override
    public void afficher() {
        System.out.print("Prévisions : ");
        if (pressionActuelle > dernierePression) {
            System.out.println("Amélioration du temps en cours !");
        } else if (pressionActuelle == dernierePression) {
            System.out.println("Temps identique");
        } else if (pressionActuelle < dernierePression) {
            System.out.println("Temps plus froid et pluvieux");
        }
    }
}