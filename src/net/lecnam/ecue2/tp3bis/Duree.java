package net.lecnam.ecue2.tp3bis;

public class Duree {
    // ATTRIBUTS : ce que chaque minute et seconde "possède"
    int minute;
    int seconde;

    /*
    // MÉTHODE : ce qu'une minute sait faire
    double surface() {
        return largeur * hauteur;
    }
    */

    // Constructeur : même nom que la classe, pas de type de retour
    Duree(int minute, int seconde) {
        this.minute = minute;
        this.seconde = seconde;

    }

    Duree(int totalSeconde){
        this.minute = totalSeconde / 60;
        this.seconde = totalSeconde % 60;
    }

    int enSecondes() {
        return minute * 60 + seconde;
    }

    void ajouter(Duree d) {
        int total = this.enSecondes() + d.enSecondes();
        this.minute = total / 60;
        this.seconde = total % 60;
    }

    boolean estPlusLongueQue(Duree d){
        int a = this.enSecondes();
        int b = d.enSecondes();
        if (a>b)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Si o n'est pas une Duree (ou vaut null), elles ne peuvent pas être égales
        if (!(o instanceof Duree)) {
            return false;
        }

        // 2. On sait maintenant que o est une Duree : on la convertit avec un cast
        Duree autre = (Duree) o;

        // 3. On compare les deux durées en secondes
        return this.enSecondes() == autre.enSecondes();
    }

    @Override
    public String toString() {
        String format;
        format = String.format("%01d:%02d", minute, seconde);
        return format;
    }

}