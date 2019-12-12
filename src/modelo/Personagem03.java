package modelo;


public class Personagem03 extends Personagem {

	public Personagem03(){
		setAtaque(new Forte());
		setMovimento(new Rapido());
		setPulo(new Baixo());
		setMagia(new Raio());
	}
}
