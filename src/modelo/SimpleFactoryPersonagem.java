package modelo;
import java.lang.Math;

public class SimpleFactoryPersonagem extends FactoryPersonagem {
	private static SimpleFactoryPersonagem instancia = null;
	
	private SimpleFactoryPersonagem() { super();}
	
	public static synchronized SimpleFactoryPersonagem getinstancia() {
		if(instancia==null)
			instancia = new SimpleFactoryPersonagem();
		return instancia;
	}
	
	public Personagem criaPersonagem() {
		double random = Math.random();
		Personagem p = new Personagem();
		
		if (random<=0.2)
			p = new Personagem01();
		else if (random<=0.4)
			p = new Personagem02();
		else if (random<=0.6)
			p = new Personagem03();
		else if (random<=0.8)
			p = new Personagem04();
		else if (random<=1.0)
			p = new Personagem05();
		
		return p;
	}

}
