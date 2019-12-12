package modelo;

public class PoderMedio extends PoderDecorador{

	public PoderMedio(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(5);
	}

}
