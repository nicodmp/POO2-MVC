package controle;
import java.util.*;

public class Controle {
	private Command[] c = new Command[10];
	private ArrayList<Command> log = new ArrayList<Command>();
	
	public void setCommand(Command c, int i){
        this.c[i] = c;
    }
	
	public void pressionar(int i){
        this.c[i].execute();
        log.add(c[i]);
    }
	
	public void executar(Command c){
        c.execute();
        log.add(c);
    }
	
	public void exibirLog(){
        for (Command c : log)
            System.out.println(c.toString());
    }
	
	public void replayLog(){
        for (Command c : log)
            c.execute();
    }

}
