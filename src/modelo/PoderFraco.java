package modelo;

public class PoderFraco extends PoderDecorador{

	public PoderFraco(Ataque danoDecorado) {
		super(danoDecorado);
		setDano(7);
	}

}
