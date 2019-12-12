package modelo;

public class Escudo25 extends Escudo{
    public int processaEscudo(int dano) {
        dano = dano - 25;

    if(dano > 0 && getSucessor()!= null) {
        getSucessor().processaEscudo(dano);
    }
    return dano;
}
}