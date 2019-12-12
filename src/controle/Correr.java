package controle;
import modelo.Personagem;

public class Correr implements Command {
	Personagem p;
	
	public Correr(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.correr();
	}
}
