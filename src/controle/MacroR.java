package controle;
import java.util.*;
import modelo.Personagem;

public class MacroR implements Command {
	Personagem p;
	
	public MacroR(Personagem personagem) {
		this.p=personagem;
	}
	
	private ArrayList<Command> macro= new ArrayList<Command>();
	
	public void add(Command c){macro.add(c);}
	
	public void execute(){
        for (Command c : macro){
            c.execute();
        }     
    }
}
