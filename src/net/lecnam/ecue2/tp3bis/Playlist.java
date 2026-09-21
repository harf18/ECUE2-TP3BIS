package net.lecnam.ecue2.tp3bis;

public class Playlist {
    String nom;
    Morceau[] morceau;
    int nbmorceau;

    public Playlist(String nom) {
        this.nom = nom;
        morceau = new Morceau[20];
        nbmorceau = morceau.length;
    }
}
