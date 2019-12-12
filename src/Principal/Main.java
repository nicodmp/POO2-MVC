/*
 * Alunos:
 * César Ricardo Salomão Junior - 11811BSI226
 * Nicolas de Melo Proença - 11811BSI234
 * Caio Marcio Santos - 11811BSI223
 */

package Principal;
import javax.swing.*;
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
import modelo.*;
import visao.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		int x = 1024;
        int y = 768;
        
        JFrame frame = new JFrame("Labirinto");
        Game game = new Game();
        
        ImageIcon background = new ImageIcon("images/bg.jpg");
        
        JLabel label = new JLabel(background);
        
        label.setBounds(0, 0, x, y);
        label.setIcon(background);
        
        game.setLayout(null);
        game.add(label);
        
        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       /* while (true) {          
            game.repaint();
            Thread.sleep(50);
        }*/
        
		/*Inimigos i1 = new Inimigos(0,0,10);
		Inimigos i2 = new Inimigos(0,0,20);
		Inimigos i3 = new Inimigos(0,0,30);
		Inimigos i4 = new Inimigos(0,0,40);
		Component labirinto = new Sala(new Abismo(), new Sala(new Sala(new Abismo(), new Sala(new Abismo(), new Saida(),"Sala3", i3),"Sala4", i4), new Saida(),"Sala2", i2),"Sala1", i1);
		Personagem p1 = new Personagem();
		Personagem p2 = new Personagem();
		Personagem p3 = new Personagem();
		
		Thread t1 = new Thread(new Game(labirinto, p1));
		Thread t2 = new Thread(new Game(labirinto, p2));
		Thread t3 = new Thread(new Game(labirinto, p3));

		t1.start();
		t2.start();
		t3.start();
		*/
		
		/* TESTE PADRAO DECORATOR 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		/*		
				Personagem p1 = new Personagem01();
				Ataque a1 = new Forte();
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());	
				a1 = new PoderForte(a1);
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());	
				a1 = new PoderMedio(a1);
				p1.setAtaque(a1);
				System.out.println("Poder recebido.");
				System.out.println("Ataque do personagem: " + p1.getAtaque().getDano());
		*/		
				
				
/* 
 * 
 * 
 * 
 * TESTE das 4 primeiras iterações
 * 
 *  
 *  */		
		
		
//		Personagem viking = new Personagem();
//		Inimigos i1 = new Inimigos(5, 10, 33);
//		Inimigos i2 = new Inimigos(13, 15, 759);
//		Inimigos i3 = new Inimigos(24, 10, 37);
//		Inimigos i4 = new Inimigos(15, 55, 555);
//		Inimigos i5 = new Inimigos(57, 20, 111);
//		Inimigos i6 = new Inimigos(18, 35, 246);
//		
//		viking.addObserver(i1);
//		viking.addObserver(i2);
//		viking.addObserver(i3);
//		viking.addObserver(i4);
//		viking.addObserver(i5);
//		viking.addObserver(i6);
//
//		
//        while(true){
//            viking.show();
//            Thread.sleep(200);
//        }
        

		

		
		
/*
 * 
 *  
 *  
 *  
 *  
 *  
 *  OUTROS TESTES
 *  
 *   
 *   
 *   
 *   
 *   */	
//		viking.levarDano(0); //levando 0 de dano só para mostrar a vida inicial do viking.
//		System.out.print("\n");
//		
//		Escudo escudo100 = new Escudo100();
//		Escudo escudo50 = new Escudo50();
//		Escudo escudo25 = new Escudo25();
//		Escudo escudo10 = new Escudo10();
//		Escudo escudo5 = new Escudo5();
//		
//		//Supondo que o personagem tem todos os escudos. Ele pode ter apenas alguns, de forma que comece, por exemplo, em escudo 25.
//		escudo100.setSucessor(escudo50);
//		escudo50.setSucessor(escudo25);
//		escudo25.setSucessor(escudo10);
//		escudo10.setSucessor(escudo5);
//		escudo5.setSucessor(null);
//		
//		escudo100.processaEscudo(523, viking); //Determinando qual personagem vai levar o dano.
		
		
	}

}
