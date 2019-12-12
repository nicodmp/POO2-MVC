package modelo;

import java.lang.Math;

public class AdvancedFactoryPersonagem extends FactoryPersonagem {
private static AdvancedFactoryPersonagem instancia = null;
	
	private AdvancedFactoryPersonagem() { super();}
	
	public static synchronized AdvancedFactoryPersonagem getinstancia() {
		if(instancia==null)
			instancia = new AdvancedFactoryPersonagem();
		return instancia;
	}
	
	public Personagem criaPersonagem() {
		double random = Math.random();
		Personagem p = new Personagem();
		Ataque a = new Forte();
		p.setAtaque(a);
		
		if (random<=0.2)
			p.setAtaque(new PoderForte(new Forte()));
		else if (random<=0.4)
			p.setAtaque(new PoderMedio(new Forte()));
		else if (random<=0.6)
			p.setAtaque(new PoderFraco(new Forte()));
		else if (random<=0.8)
			p.setAtaque(new PoderForte(new AtkMedio()));
		else if (random<=1.0)
			p.setAtaque(new PoderMedio(new AtkMedio()));
		
		return p;
	}

}
