package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {

        Duree duree = new Duree(1,3);

        Duree duree2 = new Duree(187);

        Duree duree3 = new Duree(1,59);

        Duree duree4 = new Duree(1,3);

        System.out.println(duree.estPlusLongueQue(duree3));

        System.out.println(duree.equals(duree4));

        System.out.println(duree2.minute + " minutes et " + duree2.seconde + " secondes");

        System.out.println(duree.enSecondes());

        duree.ajouter(duree3);

        System.out.println(duree.minute + " minutes et " + duree.seconde + " secondes");

        System.out.println(duree.estPlusLongueQue(duree3));

        System.out.println(duree.toString());

        Morceau morceau = new Morceau("La vida loca", "Luis Fonzi", duree);

        Morceau morceau2 = new Morceau("La casa de cabron", "La MAMA", 1,59);

        Morceau morceau3 = new Morceau("La vida loca", "Luis Fonzi", duree);

        morceau.ecouter();

        System.out.println(morceau.nbecoute);

        System.out.println(morceau.estDe("Luis Fonzi"));

        System.out.println(morceau.equals(morceau3));

        System.out.println(morceau.toString());

    }

}
