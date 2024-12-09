package hu.szamalk;

import java.util.Random;

public class Tabla {
    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        this.t = new char[8][8];
        this.uresCella = uresCella;
        feltolt();
    }

    public void feltolt(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++) {
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

        public void elhelyez(){
            Random rnd = new Random();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (rnd.nextInt(0,5) == i) {
                        t[i][j] = 'K';
                    }
                }
            }
        }



    }


