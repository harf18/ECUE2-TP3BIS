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

    public Duree retourneDureeTotale() {
        Duree dureeTotale = new Duree(0,0);
        for (int i = 0; i < nbmorceau; i++) {
            dureeTotale.ajouter(morceau[i].duree);
        }
        return dureeTotale;
    }

    public int retourneNbMorceauxDe(String artiste) {
        int nbMorceauArtiste = 0;
        for (int i = 0; i < nbmorceau; i++) {
            if (morceau[i].artiste == artiste) {
                nbMorceauArtiste += 1;
            }
        }
        return nbMorceauArtiste;
    }

    public Morceau retourneMorceauLePlusLong() {
        Duree dureeNull = new Duree(0);
        Morceau morceauLePlusLong = new Morceau("","",dureeNull);
        for (int i = 0; i < nbmorceau; i++) {
            if (morceau[i].duree.estPlusLongueQue(morceauLePlusLong.duree)) {
                morceauLePlusLong = morceau[i];
            }
        }
        return morceauLePlusLong;
    }

    public Morceau retourneMorceauLePlusEcouter() {
        Duree dureeNull = new Duree(0);
        Morceau morceauLePlusEcouter = new Morceau("","",dureeNull);
        for (int i = 0; i < nbmorceau; i++) {
            if (morceau[i].nbecoute > morceauLePlusEcouter.nbecoute) {
                morceauLePlusEcouter = morceau[i];
            }
        }
        return morceauLePlusEcouter;
    }

    public void eccouterTout() {
        for (int i = 0; i < nbmorceau; i++) {
            morceau[i].ecouter();
        }
    }

}
