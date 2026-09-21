package net.lecnam.ecue2.tp3bis;

import java.util.Locale;

public class Morceau {

    String titre, artiste;
    int nbEcoute;
    Duree tps;

    public Morceau(String title, String artist, Duree d){
        this.titre = title;
        this.artiste = artist;
        this.tps = d;
        this.nbEcoute = 0;
    }

    public Morceau(String title, String artist, int minutes, int secondes){
        this.titre = title;
        this.artiste = artist;
        this.tps = new Duree(minutes, secondes);
        this.nbEcoute = 0;
    }

    public void ecouter(){
        this.nbEcoute += 1;
    }

    public boolean estDe(String artiste){
        return (artiste.toLowerCase() == this.artiste.toLowerCase());
    }



}
