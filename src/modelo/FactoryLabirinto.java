package modelo;

public class FactoryLabirinto {
	public Component criaLabirinto() {
		Inimigos i1 = new Inimigos(0,0,10);
		Inimigos i2 = new Inimigos(0,0,20);
		Inimigos i3 = new Inimigos(0,0,30);
		Inimigos i4 = new Inimigos(0,0,40);
		Component l = new Sala(new Abismo(), new Sala(new Sala(new Abismo(), new Sala(new Abismo(), new Saida(),"Sala3", i3),"Sala4", i4), new Saida(),"Sala2", i2),"Sala1", i1);
		
		return l;
	}
}
