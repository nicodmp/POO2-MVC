package controle;
import modelo.Personagem;

public class MoverBaixo implements Command {
	Personagem p;
	
	public MoverBaixo(Personagem personagem) {
		this.p= personagem;
	}
	
	public void execute() {
		this.p.setY(this.p.getY()-1);
	}
}
