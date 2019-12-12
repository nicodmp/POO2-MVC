package modelo;

public class Escudo100 extends Escudo{
    public int processaEscudo(int dano) {
        dano = dano - 100;

    if(dano > 0 && getSucessor()!= null) {
        getSucessor().processaEscudo(dano);
    }
    return dano;
}
}