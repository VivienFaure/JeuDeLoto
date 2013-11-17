public class Joueur {
    private int nombreTentatives;
    private Boules[] boules;


    public Joueur() {
        nombreTentatives = 0;
        boules = new Boules[6];
        for (int i = 0; i < boules.length; i++) {
            boules[i] = new Boules();
        }
    }

    public void jouerUnticket() {
        while (perdu()) {
            nombreTentatives++;
            effectuerUnTirage();
        }
    }

    private void effectuerUnTirage() {
        for (Boules b : boules) {
            b.lancer();
        }
    }

    private boolean perdu() {
        boolean perdu = true;
        Combinaison combinaison = new Combinaison();
        for (Boules b : boules) {
            combinaison.valeurGagnante(b.lireNumero());
        }
        if (combinaison.gagnante()) {
            System.out.println(nombreTentatives + " tentatives avant de gagner");
            return false;
        }
        return perdu;
    }
}
