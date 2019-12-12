package controle;
import modelo.Personagem;

public class Pular implements Command {
	Personagem p;
	
	public Pular(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.pular();
	}
}
