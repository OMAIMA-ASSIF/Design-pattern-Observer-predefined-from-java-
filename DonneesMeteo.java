import java.util.Observable;
import java.util.Observer;


public class DonneesMeteo extends Observable{
	private float temperature;
	private float humidite;
	private float pression;
	
	public void actualiserMesures() {
		setChanged();
		notifyObservers();
		
	}
	
	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature= temperature;
		this.humidite=humidite;
		this.pression=pression;
		actualiserMesures();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidite() {
		return humidite;
	}
	
	public float getPression() {
		return pression;
	}
	
}
