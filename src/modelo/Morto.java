package modelo;

public class Morto extends Estado {

	public Morto(Personagem personagem) {
		super(personagem);
	}
	
	public void verificarEstado() {
	}
	
	public void setLimites() {
		this.setLimiteinf(0);
		this.setLimitesup(0);
	}
}
