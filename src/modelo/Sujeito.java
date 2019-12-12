package modelo;

public interface Sujeito {
	
	public void addObserver(Observador a);
	
	public void removeObserver(Observador a);
	
	public void notifyObserver();
}
