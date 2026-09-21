package net.lecnam.ecue2.tp3bis;

public class Playlist {
    String nom;
    Morceau[] morceau;
    int nbmorceau;

    public Playlist(String nom) {
        this.nom = nom;
        morceau = new Morceau[20];
        nbmorceau = 0;
    }

    public boolean ajout(Morceau nouveauMorceau) {
        if (nbmorceau >= 20) {
            return false;
        }
        for (int i = 0; i < nbmorceau; i++) {
            if (morceau[i].equals(nouveauMorceau)) {
                return false;
            }
        }
        morceau[nbmorceau] = nouveauMorceau;
        nbmorceau++;
        return true;
    }

}
