package controle;
import modelo.Personagem;

public class MoverDir implements Command {
	Personagem p;
	
	public MoverDir(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.setX(this.p.getX()+1);
	}
}
