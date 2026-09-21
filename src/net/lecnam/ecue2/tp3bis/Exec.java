package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {

        Duree duree1 = new Duree(165);
        Duree duree2 = new Duree(30);
        duree1.ajouter(duree2);
        String duree = duree1.toString();

        System.out.printf(duree);
        System.out.printf("%b \n", duree2.estPlusLongueQue(duree1));

        Morceau musique  = new Morceau("reine","DADJU",2,23);
        Morceau musique1  = new Morceau("jaloux","DADJU",1,21);

        System.out.printf("c'est : %b\n",musique.estDe("dadju"));
        System.out.printf("%b\n",musique.equals(musique1));
        System.out.printf("%s",musique.toString());
        System.out.printf("%s",musique1.toString());


    }
}
