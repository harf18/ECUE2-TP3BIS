package net.lecnam.ecue2.tp3bis;

public class Morceau {
    String titre;
    String artiste;
    Duree duree;
    int nbecoute;

    public Morceau(String titre, String artiste, Duree duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;
        this.nbecoute = 0;
    }

    public Morceau(String titre, String artiste, int minute, int seconde) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = new Duree(minute, seconde);
        this.nbecoute = 0;
    }

    public void ecouter() {
        this.nbecoute += 1;
    }

    public boolean estDe(String artiste) {
        if (this.artiste == artiste) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Morceau morceau = (Morceau) o;
        return this.titre == morceau.titre
                && this.artiste == morceau.artiste;
    }

    public String toString() {
        return this.artiste + " - " + this.titre + " (" + String.format("%d:%02d", this.duree.minute, this.duree.seconde) + ") - " + this.nbecoute + " écoutes";
    }
}
