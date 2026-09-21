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
        return (artiste.toLowerCase().equals(this.artiste.toLowerCase()));
    }

    public boolean equals(Morceau m){
        if (this == m) return true;
        if (m == null || m.getClass() != getClass()) return false;
        return (m.artiste == this.artiste && m.titre == this.titre);
    }

    public String toString(){
        return this.titre + " - " + this.artiste + " (" + this.tps.toString() + ") - " + this.nbEcoute + " " + (this.nbEcoute <= 1 ? "écoute" : "écoutes");
    }

}
