package net.lecnam.ecue2.tp3bis;

import java.util.concurrent.ThreadLocalRandom;

public class Exec3 {

    public static void main(String[] args) {

        Playlist p = new Playlist("La playlist qui tue");
        Duree d1 = new Duree(3, 5);
        Morceau m1 = new Morceau("Black Summer", "RHCP", d1);
        Morceau m2 = new Morceau("Hump de Bump", "RHCP", d1);
        Morceau m3 = new Morceau("Californication", "RHCP", 3, 15);
        Morceau m4 = new Morceau("Stronger Than You", "Steven Universe", 10, 15);

        p.ajouter(m1);
        p.ajouter(m2);
        p.ajouter(m3);
        p.ajouter(m4);
        if (!p.ajouter(m1)) System.out.println("Morceau bien refusé");

        System.out.println(p.retourneDuree());

        for (int i = 0; i < 20; i++){
            if (ThreadLocalRandom.current().nextInt(0, 2) == 1) m1.ecouter();
            if (ThreadLocalRandom.current().nextInt(0, 2) == 1) m2.ecouter();
            if (ThreadLocalRandom.current().nextInt(0, 2) == 1) m3.ecouter();
            if (ThreadLocalRandom.current().nextInt(0, 2) == 1) m4.ecouter();
        }

        System.out.println(m1.nbEcoute);
        System.out.println(m2.nbEcoute);
        System.out.println(m3.nbEcoute);
        System.out.println(m4.nbEcoute);

        p.ecouterTout();

        System.out.println(m1.nbEcoute);
        System.out.println(m2.nbEcoute);
        System.out.println(m3.nbEcoute);
        System.out.println(m4.nbEcoute);

        System.out.println(p.retourneMorceauLePlusEcoute().toString());
        System.out.println(p.retourneMorceauLePlusLong().toString());

        System.out.println(p.retourneNbMorceauxDe("RHCP"));


    }

}
