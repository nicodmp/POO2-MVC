package modelo;

import java.util.ArrayList;

public class Personagem implements Sujeito{
	private Ataque a;
	private Movimento c;
	private Pulo p;
	private Magia m;
	private Estado estado;
	private int vida;
	private int x;
	private int y;
	
	private ArrayList<Observador> lista = new ArrayList<Observador>();

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

	public Personagem() {
		this.vida = 70;
		this.estado = new Normal(this);
		this.setPos(0, 0);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setAtaque(Ataque a) {
		this.a = a;
	}
	public Ataque getAtaque() {
		return this.a;
	}
	
	public void setMovimento(Movimento c) {
		this.c = c;
	}
	
	public void setPulo(Pulo p) {
		this.p = p;
	}
	
	public Magia getM() {
		return m;
	}

	public void setMagia(Magia m) {
		this.m = m;
	}

	public void atacar() {
		a.atacar();
	}
	
	public void correr() {
		c.correr();
	}
	
	public void pular() {
		p.pular();
	}
	
	public void castar() {
		m.castar();
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void levarDano(int dano) {
		estado.levarDano(dano);
		System.out.println("Dano: " +dano);
		System.out.println("Vida atual: " +this.getVida());
		System.out.println("Estado: " +this.estado.getClass().getName());
		estado.verificarEstado();
	}
	
	public void pegarRecompensa(int recompensa) {
		estado.pegarRecompensa(recompensa);
		System.out.println("Recompensa: " +recompensa+ " de vida.");
		System.out.println("Vida atual: " +this.getVida());
		System.out.println("Estado: " +this.estado.getClass().getName());
		estado.verificarEstado();
	}

	@Override
	public void addObserver(Observador a) {
		lista.add(a);
	}

	@Override
	public void removeObserver(Observador a) {
		lista.remove(a);
	}

	@Override
	public void notifyObserver() {
		for(Observador a : lista) {
			a.update(this);
		}
	}
	
	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Posição do personagem: (" +x+","+y+")");
	}
	
	public void show() {
		notifyObserver();
	}

}
