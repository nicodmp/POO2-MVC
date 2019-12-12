package controle;
import modelo.Personagem;

public class Atacar implements Command {
	Personagem p;
	
	public Atacar(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.atacar();
	}
}
