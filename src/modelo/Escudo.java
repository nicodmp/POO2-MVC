package modelo;


public abstract class Escudo {

    private Escudo sucessor;

    public void setSucessor(Escudo sucessor) {
        this.sucessor = sucessor;
    }

    public Escudo getSucessor() {
        return this.sucessor;
    }

    public abstract int processaEscudo(int dano);

}