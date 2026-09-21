package net.lecnam.ecue2.tp3bis;

public class Duree {
    private int minute;
    private int secondes;


    public Duree(int minuite, int secondes)
    {
        this.minute = minuite;
        this.secondes = secondes;
    }
    public Duree(int temps)
    {
        this.minute = temps/60;
        this.secondes = temps % 60;
    }
    public void setMinuite(int minuite)
    {
        this.minute = minuite;
    }
    public void setSecondes(int secondes){
        this.secondes = secondes;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecondes() {
        return secondes;
    }

    public int enSecondes()
    {
        return this.minute*60 + this.secondes;
    }
     public void ajouter(Duree duree)
     {
         int sommeSecondes = getSecondes() + duree.getSecondes();
         this.minute = getMinute() + duree.getMinute() + sommeSecondes/60;
         this.secondes =  sommeSecondes % 60;
     }
     public boolean estPlusLongueQue(Duree d)
     {
        return  this.enSecondes() > d.enSecondes();
     }

     @Override
     public boolean equals( Object o)
     {
         if(o == null) return false;
         if(o ==  this) return true;
         if(!(o instanceof Duree)) return false;
         return ((Duree) o).getMinute() == this.getMinute() && ((Duree) o).getSecondes() == this.getSecondes();
     }
     @Override
     public String toString() {
         return String.format("\n%d:%02d\n",this.getSecondes(), this.getSecondes());
     }

}
