package controle;
import modelo.Personagem;

public class MoverEsq implements Command {
	Personagem p;
	
	public MoverEsq(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.setX(this.p.getX()-1);
	}
}
