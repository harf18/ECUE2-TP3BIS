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

    

}
