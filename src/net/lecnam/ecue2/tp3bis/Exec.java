package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {
        Duree d1 = new Duree(3, 30);
        Duree d2 = new Duree(187);
        System.out.println(d2.minute + " min " + d2.seconde + " s"); // doit afficher 3 min 7 s
        System.out.println(d1.enSecondes());

        d1.ajouter(d2);
        System.out.println(d1.minute + ":" + d1.seconde);  // 3:15

        Duree d3 = new Duree(4, 30);
        Duree d4 = new Duree(3, 30);

        System.out.println(d3.estPlusLongueQue(d4));


        Duree d5 = new Duree(3, 30);
        Duree d6 = new Duree(3, 30);
        Duree d7 = new Duree(210);

        System.out.println(d5 == d6);          // false : deux objets différents en mémoire
        System.out.println(d5.equals(d6));     // true  : même durée
        System.out.println(d5.equals(d7));     // true  : 210 s = 3:30
        System.out.println(d5.equals(null));   // false, sans planter
        System.out.println(d5.equals("3:30")); // false : ce n'est pas une Duree

        Duree d8 = new Duree(6, 3);
        System.out.println(d8.toString());

    }

}
