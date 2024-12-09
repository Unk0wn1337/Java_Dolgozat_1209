package hu.szamalk;

public class Main {
    public static void main(String[] args) {

        Tabla t = new Tabla('#');
        //System.out.println("4. feladat üres tábla:");
        //t.megjelenit();
        System.out.println(" ");

        System.out.println("6. feladat: A feltöltött tábla:");
        t.elhelyez();
        t.megjelenit();


        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Sorok:"+t.uresSorokSzama());
        System.out.println("Oszlop:"+t.uresOszlopokSzama());

        System.out.println("------------- F3 ---------------");

        Adatszerkezet adat = new Adatszerkezet();
        System.out.println("Név és 10 betű:");
        System.out.println(adat.nevMegjelenit());
        System.out.println(adat.randomBetukMegjelent());


    }
}