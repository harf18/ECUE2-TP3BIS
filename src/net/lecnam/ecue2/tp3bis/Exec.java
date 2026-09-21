package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {

        Duree d1 = new Duree(3, 5);
        Duree d2 = new Duree(183);
        System.out.println(d1.enSecondes());
        System.out.println(d2.enSecondes());
        d1.ajouter(d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.estPlusLongueQue(d2));
        System.out.println(d1.toString());
    }

}
