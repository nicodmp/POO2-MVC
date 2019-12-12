package modelo;

public class Escudo50 extends Escudo{
    public int processaEscudo(int dano) {
        dano = dano - 50;

    if(dano > 0 && getSucessor()!= null) {
        getSucessor().processaEscudo(dano);
    }
    return dano;
}
}