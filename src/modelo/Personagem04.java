package modelo;


public class Personagem04 extends Personagem {

	public Personagem04(){
		setAtaque(new Forte());
		setMovimento(new Rapido());
		setPulo(new Baixo());
		setMagia(new Gelo());
	}
}
