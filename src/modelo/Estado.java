package modelo;

public abstract class Estado {
	private Personagem personagem;
	private int limiteinf;
	private int limitesup;
	
	public Personagem getPersonagem() {
		return this.personagem;
	}
	
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public Estado(Personagem personagem) {
		this.personagem = personagem;
		setLimites();
	}
	
	public void levarDano(int dano) {
		this.personagem.setVida(this.personagem.getVida() - dano);
		this.verificarEstado();
	}
	
	public void pegarRecompensa(int recompensa) {
		this.personagem.setVida(this.personagem.getVida() + recompensa);
		this.verificarEstado();
	}
	
	public abstract void verificarEstado();
	protected abstract void setLimites();

	public int getLimitesup() {
		return limitesup;
	}

	public void setLimitesup(int limitesup) {
		this.limitesup = limitesup;
	}

	public int getLimiteinf() {
		return limiteinf;
	}

	public void setLimiteinf(int limiteinf) {
		this.limiteinf = limiteinf;
	}
}
