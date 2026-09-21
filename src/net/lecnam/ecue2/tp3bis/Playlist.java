package net.lecnam.ecue2.tp3bis;

public class Playlist {
    private String nom ;
    private Morceau[] morceaux;
    private int  nbMorceu ;

    public Playlist(String nom) {
        this.nom = nom;
        this.morceaux = new Morceau[20];
        this.nbMorceu = 0;
    }

    public void ajout(Morceau morceau)
    {
        this.morceaux[nbMorceu++] = morceau;
    }
}
