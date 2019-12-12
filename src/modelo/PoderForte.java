package modelo;

public class PoderForte extends PoderDecorador{

	public PoderForte(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(10);
	}

	
	
}
