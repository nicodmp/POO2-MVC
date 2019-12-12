package modelo;

public class Personagem01 extends Personagem {

	public Personagem01() {
		setAtaque(new Forte());
		setMovimento(new MovMedio());
		setPulo(new Medio());
		setMagia(new Fogo());
	}
}
