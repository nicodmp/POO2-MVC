package modelo;

public class Personagem02 extends Personagem {

	public Personagem02() {
		setAtaque(new AtkMedio());
		setMovimento(new Rapido());
		setPulo(new Baixo());
		setMagia(new Gelo());
	}
}
