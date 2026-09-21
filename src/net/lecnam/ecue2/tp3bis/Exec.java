package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {

        Duree duree1 = new Duree(165);
        Duree duree2 = new Duree(30);
        duree1.ajouter(duree2);
        String duree = duree1.toString();

        System.out.printf(duree);
        System.out.printf("%b \n", duree2.estPlusLongueQue(duree1));
    }
}
