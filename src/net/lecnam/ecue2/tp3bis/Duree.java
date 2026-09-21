package net.lecnam.ecue2.tp3bis;

public class Duree {

    int minutes, secondes;

    public Duree(int min, int sec){
        this.minutes = min;
        this.secondes = sec;
    }

    public Duree(int sec){
        this.secondes = sec % 60;
        this.minutes = (sec - this.secondes) / 60;
    }

    public int enSecondes(){
        return this.minutes * 60 + this.secondes;
    }

    public void ajouter(Duree d){
        if (d.secondes + this.secondes > 59) {
            this.minutes += d.minutes + 1;
            this.secondes = this.secondes + d.secondes - 60;
        } else {
            this.minutes += d.minutes;
            this.secondes += d.secondes;
        }
    }

    public boolean estPlusLongueQue(Duree d){
        if (d.minutes < this.minutes){
            return true;
        } else if (d.minutes > this.minutes) {
            return false;
        } else {
            if (d.secondes < this.secondes){
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean equals(Duree d){
        if (this == d) return true;
        if (d == null || d.getClass() != getClass()) return false;
        return (d.minutes == this.minutes && d.secondes == this.secondes);
    }

    public String toString(){
        return this.minutes + ":" + String.format("%02d", this.secondes);
    }

}
