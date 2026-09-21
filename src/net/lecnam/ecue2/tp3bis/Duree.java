package net.lecnam.ecue2.tp3bis;

public class Duree {
    int minute;
    int seconde;

    public Duree(int minute, int seconde) {
        this.minute = minute;
        this.seconde = seconde;
    }

    public Duree(int surcharge) {
        this.minute = surcharge / 60;
        this.seconde = surcharge % 60;
    }

    public int enSecondes() {
        return this.minute * 60 + this.seconde;
    }

    public void ajouter(Duree d) {
        if (this.seconde + d.seconde > 60) {
            this.seconde += d.seconde - 60;
            this.minute += d.minute + 1;
        } else {
            this.seconde += d.seconde;
            this.minute += d.minute;
        }
    }

    public boolean estPlusLongueQue(Duree d) {
        return this.minute > d.minute ||
                (this.minute == d.minute && this.seconde > d.seconde);
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Duree duree = (Duree) o;
        return this.minute == duree.minute
                && this.seconde == duree.seconde;
    }

    public String toString() {
        return String.format("%d:%02d", this.minute, this.seconde);
    }
}
