package visao;
import controle.Controle;
import modelo.Component;
import modelo.FactoryControle;
import modelo.Personagem;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.RenderingHints;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel implements Runnable {
	private Controle c;
	private Component labirinto;
    private Personagem p;
    
    public Game() {
    	
    }
    
    public Game(Component labirinto, Personagem p){
    	c = new Controle();
    	c = FactoryControle.getinvoker(p);
    	
    	KeyListener listener = new MyKeyListener();
    	addKeyListener(listener);
        setFocusable(true);
    	
        this.labirinto = labirinto;
        this.p = p;
        
    }
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT){                
                c.pressionar(0);    
        }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                c.pressionar(1);    
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                c.pressionar(2);    
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                c.pressionar(3);    
               
            if (e.getKeyCode() == KeyEvent.VK_Z)
                c.pressionar(4);    

            if (e.getKeyCode() == KeyEvent.VK_V)
                c.pressionar(5);
            
            if (e.getKeyCode() == KeyEvent.VK_X)
                c.pressionar(6); 
            
            if (e.getKeyCode() == KeyEvent.VK_C)
                c.pressionar(7); 
            
            if (e.getKeyCode() == KeyEvent.VK_A)
                c.pressionar(8); 
            
            if (e.getKeyCode() == KeyEvent.VK_S)
                c.pressionar(9); 

            if (e.getKeyCode() == KeyEvent.VK_L)
                c.exibirLog();    
                
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }

    public void run(){
        
        labirinto.jogar(p);
        
    }

}
