package modelo;

public class EstadoForte extends Estado {

	public EstadoForte(Personagem personagem) {
		super(personagem);
		super.getPersonagem().setAtaque(new Forte());
		super.getPersonagem().setMovimento(new Rapido());
	}
	
	public void verificarEstado() {
		if(this.getPersonagem().getVida() < this.getLimiteinf()) {
			this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
		}
	}

	protected void setLimites() {
		this.setLimiteinf(70);
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
