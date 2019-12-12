package modelo;

public class PoderDecorador extends Ataque { 
	
	private Ataque danoDecorado;

	public PoderDecorador(Ataque danoDecorado) {
		this.danoDecorado = danoDecorado;
		
	}
	
	public int getDano() {
		return danoDecorado.getDano() + this.dano;
	}
	
	public Ataque getDanoDecorado() {
		return danoDecorado;
	}

	public void setDanoDecorado(Ataque danoDecorado) {
		this.danoDecorado = danoDecorado;
	}

	@Override
	public void atacar() {
		
	}
	
}
