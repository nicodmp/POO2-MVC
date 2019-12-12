package modelo;

public class Inimigos implements Observador {
	private int x;
	private int y;
	private int dano;
	
	public Inimigos(int x, int y, int dano) {
		this.x = x;
		this.y = y;
		this.setDano(dano);
	} 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void update(Sujeito s) {
		Personagem personagem = (Personagem)s;
		
		if(((this.x - personagem.getX()) == 0) && ((this.y - personagem.getY()) == 0)){
			System.out.print("\n");
			System.out.println("Inimigo " +this+ " atacou o personagem.");
			Escudo escudo100 = new Escudo100();
			Escudo escudo50 = new Escudo50();
			Escudo escudo25 = new Escudo25();
			Escudo escudo10 = new Escudo10();
			
			//Supondo que o personagem tem todos os escudos. Ele pode ter apenas alguns, de forma que comece, por exemplo, em escudo 25.
			escudo100.setSucessor(escudo50);
			escudo50.setSucessor(escudo25);
			escudo25.setSucessor(escudo10);
			escudo10.setSucessor(null);
			
			//escudo100.processaEscudo(this.dano, personagem); //Determinando qual personagem vai levar o dano.
			System.out.print("\nPersonagem pegou uma recompensa!\n");
			personagem.pegarRecompensa((int)(Math.random()*10)); //gera recompensas aleatórias.
			if(Math.random() < 0.5) {
				personagem.setPos(personagem.getX() + 5, personagem.getY()+5);
			} else {
				personagem.setPos(personagem.getX() - 5, personagem.getY()+5);
			}
		}
		
		else {
		           //se precisa andar para frente 
		           if (personagem.getX() > this.x) this.x = this.x+1;
		           else this.x = this.x-1;
		           //se precisa andar para tras
		           if (personagem.getY() > this.y) this.y = this.y+1;
		           else this.y = this.y-1;
		     
		        }                        
		}
		

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
	
}
