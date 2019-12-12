package modelo;

public class Escudo10 extends Escudo{
    public int processaEscudo(int dano) {
        dano = dano - 10;

    if(dano > 0 && getSucessor()!= null) {
        getSucessor().processaEscudo(dano);
    }
    return dano;
}
}