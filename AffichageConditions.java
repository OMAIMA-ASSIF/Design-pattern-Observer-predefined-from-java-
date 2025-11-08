import java.util.Observer;
import java.util.Observable;

public class AffichageConditions implements Observer, Affichage {
	
	Observable observable;
	private float temperature;
	private float humidite;
	
	public AffichageConditions(Observable observable) {
		this.observable= observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof DonneesMeteo) {
			DonneesMeteo donneesMeteo = (DonneesMeteo)obs;
			this.temperature=donneesMeteo.getTemperature();
			this.humidite=donneesMeteo.getHumidite();
			afficher();
		}
		
	}

	@Override
	public void afficher() {
		System.out.println("Conditions actuelles : " + temperature + "degres de C , " +humidite +"% d'humidite ");
		
	}

	
	
}
