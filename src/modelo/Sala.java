package modelo;
import java.util.*;

public class Sala implements Component {
	private Component caminho1;
    private Component caminho2;
    private String nome;
    private Inimigos inimigo;
    private List<Component> caminhos = null;
    
    public void addCaminho (Component c) {
    	caminhos.add(c);
    }
    
    public void removeCaminho (Component c) {
    	caminhos.remove(c);
    }
    
    public Sala() {
    	
    }
    
    public Sala(Component c1, Component c2, String nome, Inimigos inimigo){
    	this.caminhos = new ArrayList<>();
        this.caminho1 = c1;
        this.caminho2 = c2;
        this.nome = nome;
        this.inimigo = inimigo;
        }
    
    public void jogar(Personagem p){
        try {
          Thread.sleep(2000);
        }
        catch(Exception e) {
        }
        
        System.out.println("Personagem "+p.getVida()+" entrou na sala "+this.nome+" e encontrou o inimigo "+this.inimigo);
    
        double valor = Math.random();
        
        if (valor < 0.5) {
            System.out.println("Personagem "+p.getVida()+" pegou caminho 1"); 
            caminho1.jogar(p);
        }
        
        else {

            System.out.println("Personagem "+p.getVida()+" pegou caminho 2");   
            caminho2.jogar(p);
        }
    }
}
