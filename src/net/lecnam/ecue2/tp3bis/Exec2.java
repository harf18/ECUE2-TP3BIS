package net.lecnam.ecue2.tp3bis;


public class Exec2 {

    public static void main(String[] args) {

        Duree d1 = new Duree(3, 5);

        Morceau m1 = new Morceau("Black Summer", "RHCP", d1);
        m1.ecouter();
        System.out.println(m1.toString());
        m1.ecouter();
        System.out.println(m1.toString());
        System.out.println(m1.estDe("RHCP"));

    }

}
