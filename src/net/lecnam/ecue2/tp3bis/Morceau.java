package net.lecnam.ecue2.tp3bis;

public class Morceau {
    String titre;
    String artiste;
    Duree duree;
    int nbEcoute;

    int minute;
    int seconde;

    Morceau(String titre, String artiste, Duree duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;

    }

    Morceau(String titre, String artiste, int minute, int seconde) {
        this(titre, artiste, new Duree(minute, seconde));
    }
}