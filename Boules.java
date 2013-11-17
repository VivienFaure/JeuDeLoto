public class Boules {
    private int valeurBoule;
    private final int bouleMax = 49;
    private Boules[] boules;

    public Boules() {
        valeurBoule = 1;
    }

    public int lireNumero() {
        return valeurBoule;
    }

    public void lancer() {
        valeurBoule = (int) (Math.random() * bouleMax) + 1;
    }
}

