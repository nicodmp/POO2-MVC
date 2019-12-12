package modelo;

public abstract class Ataque {

	protected int dano;
	
	public abstract void atacar();

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
}
