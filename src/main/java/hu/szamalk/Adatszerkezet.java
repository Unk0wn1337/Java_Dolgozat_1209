package hu.szamalk;

import java.util.*;


public class Adatszerkezet {
    private String[] nev;
    private String[] randomBetuk;
    private static Random rnd;
    private TreeSet<String> abcRendezLista;

    public Adatszerkezet() {
        this.nev = new String[5];
        this.randomBetuk = new String[10];
        abcRendezLista = new TreeSet<>();
        nevBedrotozas();
        abcBedrotoz();

    }

    public void nevBedrotozas(){
        nev[0] = "K";
        nev[1] = "e";
        nev[2] = "n";
        nev[3] = "d";
        nev[4] = "e";
    }


    public String nevMegjelenit(){
        String f = "";
        for(int i = 0; i < nev.length; i++){
            if(i == 0){
                f += nev[i];
            } else {
                f += ",";
                f += nev[i];
            }
        }
        return f;
    }

    public void abcBedrotoz(){
        randomBetuk[0] = "A";
        randomBetuk[1] = "J";
        randomBetuk[2] = "C";
        randomBetuk[3] = "L";
        randomBetuk[4] = "L";
        randomBetuk[5] = "C";
        randomBetuk[6] = "Z";
        randomBetuk[7] = "V";
        randomBetuk[8] = "Z";
        randomBetuk[9] = "Z";

    }


    public String randomBetukMegjelent(){
        String f = "";
        for(int i = 0; i < randomBetuk.length; i++){
            if(i == 0){
                f += randomBetuk[i];
            } else {
                f += ",";
                f += randomBetuk[i];
            }
        }
        return f;
    }


    public void abcRendez() {
        abcRendezLista.addAll(Arrays.asList(randomBetuk));
    }


  //  public List<String> getAbcRendezLista() {
   //     return Collections.unmodifiableList(abcRendezLista);
  //  }
    
    public void betuMegszamolas(){
        HashMap<Integer, String> a = new HashMap<>();
        for(int i = 0; i < randomBetuk.length; i++){
            a.put(i,randomBetuk[i]);
        }

    }

}
