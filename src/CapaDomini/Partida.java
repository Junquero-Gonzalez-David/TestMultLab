package CapaDomini;

public class Partida {

    private int dau1, dau2;
    private Jugador jugador;
    private int id;
    
    public Partida(Jugador jugador,int d1, int d2,int id) {
    	this.jugador = jugador;
    	this.id = id;
        dau1 = d1;
        dau2 = d2;
    }

    public boolean getGuanyada() {
        return dau1 + dau2 == 7;
    }

    @Override
    public String toString() {
        String resultat;

        if (getGuanyada()) {
            resultat = "guanyada";
        } else {
            resultat = "perduda";
        }
        return "Dau1: " + dau1 + ", Dau2: " + dau2 + ", Resultat: " + resultat;
    }

    public int getDau1() {
        return dau1;
    }
    
    public int getDau2() {
        return dau2;
    }
    public Jugador getJugador(){return this.jugador;}
}
