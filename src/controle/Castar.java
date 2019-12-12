package controle;
import modelo.Personagem;

public class Castar implements Command {
	Personagem p;
	
	public Castar(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.castar();
	}
}
