package modelo;

public class Perigo extends Estado {

	public Perigo(Personagem personagem) {
		super(personagem);
		super.getPersonagem().setAtaque(new Fraco());
		super.getPersonagem().setMovimento(new Devagar());
	}
	
	public void verificarEstado() {
		if(this.getPersonagem().getVida() == this.getLimiteinf()) {
			this.getPersonagem().setEstado(new Morto(this.getPersonagem()));
		}
		if(this.getPersonagem().getVida() > this.getLimitesup()) {
			this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
		}
	}
	
	public void setLimites() {
		this.setLimiteinf(0);
		this.setLimitesup(29);
	}
	
	public void levarDano(int dano) {
		this.getPersonagem().setVida(this.getPersonagem().getVida() - dano);
		this.verificarEstado();
	}
	
	public void pegarRecompensa(int recompensa) {
		this.getPersonagem().setVida(this.getPersonagem().getVida() + recompensa);
		this.verificarEstado();
	}
}
