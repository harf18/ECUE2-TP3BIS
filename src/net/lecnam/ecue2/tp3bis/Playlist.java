package net.lecnam.ecue2.tp3bis;

public class Playlist {

    String nom;
    Morceau[] liste;
    int nbMorceaux;

    public Playlist(String nom){
        this.nom = nom;
        this.liste = new Morceau[20];
        this.nbMorceaux = 0;
    }

    public boolean ajouter(Morceau m){

        boolean present = false;
        for (Morceau mTemp : this.liste){
            if (mTemp.equals(m)) {
                present = true;
            }
        }

        if (!present) {
            this.liste[this.nbMorceaux] = m;
            this.nbMorceaux += 1;
            return true;
        } else {
            return false;
        }
    }

}
