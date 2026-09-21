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

    public Duree retourneDuree(){
        Duree dureeTotale = new Duree(0);
        for (Morceau m : this.liste){
            dureeTotale.ajouter(m.tps);
        }
        return dureeTotale;
    }

    public int retourneNbMorceauxDe(String name){
        int compteur = 0;
        for (Morceau m : this.liste){
            if (m.estDe(name)){
                compteur += 1;
            }
        }
        return compteur;
    }
    

}
