package net.lecnam.ecue2.tp3bis;

public class Morceau {
    private String titre = null;
    private String artiste = null;
    private Duree duree;
    private int nbEcoute ;

    public Morceau(String titre, String artiste, Duree duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;
        this.nbEcoute = 0;
    }
    public Morceau(String titre, String artiste, int minutes , int secondes) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = new Duree(minutes, secondes);
        this.nbEcoute = 0;
    }
    public void ecouter()
    {
        this.nbEcoute++;
    }
    public boolean estDe(String artiste)
    {
        if(this.artiste == null || artiste == null)
        {
            return false;
        }
        return  this.artiste.equalsIgnoreCase(artiste);
    }
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Morceau)) return false;
        if(o == this) return true;
        return  estDe(this.artiste) && this.titre.equalsIgnoreCase(((Morceau) o).titre);
    }
    @Override
    public String toString()
    {
        return this.artiste+" " + this.titre +" "+"("+this.duree.toString()+")" +" "+ this.nbEcoute+" "+"écoutes"+"\n";
    }
}
