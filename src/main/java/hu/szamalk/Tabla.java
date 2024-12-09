package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] t;
    private char uresCella;
    private static Random rnd = new Random();

    public Tabla(char uresCella) {
        this.t = new char[8][8];
        this.uresCella = uresCella;
        feltolt();
    }

    public void feltolt() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                t[i][j] = uresCella;
            }
        }
    }

    public void megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }

    public void elhelyez() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (rnd.nextInt(0, 9) == j) {
                    t[i][j] = 'K';
                }
            }
        }
    }

    public boolean uresOszlop(int oszlop) {
        boolean vanKiralynoBenne = false;
        for (int i = 0; i < 8; i++) {
            if (oszlop >= 0 && oszlop < 8) {
                if (t[i][oszlop] != 'K') {
                    vanKiralynoBenne = true;
                }
            }
        }
        return vanKiralynoBenne;
    }

    public boolean uresSor(int sor) {
        boolean vanKiralynoBenne = false;
        if (sor >= 0 && sor < 8) {
            for (int j = 0; j < 8; j++) {
                if (t[sor][j] == 'K') {
                    vanKiralynoBenne = true;
                }
            }
        }
        return vanKiralynoBenne;
    }

    public int uresOszlopokSzama() {
        int karakterekSzama = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (t[j][i] != uresCella) {
                    karakterekSzama++;
                }
            }
        }
        return karakterekSzama;
    }

    public int uresSorokSzama() {
        int karakterekSzama = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (t[i][j] != uresCella) {
                    karakterekSzama++;
                }
            }
        }
        return karakterekSzama;
    }
}




