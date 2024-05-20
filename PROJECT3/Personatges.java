public class Personatges {
    protected String nom;
    protected int nivell;
    protected int puntsDeVida;
    protected int puntsDeMana;
    protected int danys;

    public Personatges(String nom, int nivell, int puntsDeVida, int puntsDeMana, int danys) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsDeVida = puntsDeVida;
        this.puntsDeMana = puntsDeMana;
        this.danys = danys;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntsDeVida() {
        return puntsDeVida;
    }

    public int getPuntsDeMana() {
        return puntsDeMana;
    }
}
