package hu.szamalk;

public class Tabla {
    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        this.t = new char[8][8];
        this.uresCella = uresCella;
    }
}
