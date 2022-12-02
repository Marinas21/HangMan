package com.company;

import java.util.Scanner;

public class Teren {
    char[] cuvant;
    char[] tabla;
    int viata;
    Scanner scanner = new Scanner(System.in);

    public Teren(String litere) {
        viata = 5;
        cuvant = new char[litere.length()];
        tabla = new char[litere.length()];
        for (int i = 0; i < litere.length(); i++) {
            cuvant[i] = litere.charAt(i);
            if (i == 0) {
                tabla[i] = litere.charAt(i);
            } else if (litere.charAt(i) == tabla[0]) {
                tabla[i] = litere.charAt(i);
            } else {
                tabla[i] = '_';
            }

        }
    }

    public void viata(boolean raspuns) {
        int spatii = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == '_') {
                spatii++;
            }
        }
        if (spatii != 0) {
            if (!raspuns) {
                viata--;

            }
            if (viata == 0) {
                System.out.println("Game over");

            } else {
                System.out.println("Viata: " + viata);
                System.out.print("Introduceti o litera: ");
                char x = scanner.nextLine().charAt(0);
                System.out.println();
                verificare(x);
            }

        } else {
            System.out.println("Ai castigat");
        }
    }

    public void verificare(char litera) {
        boolean index = false;
        for (int i = 0; i < this.cuvant.length; i++) {
            if (cuvant[i] == litera) {
                tabla[i] = litera;
                index = true;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i]);
        }
        System.out.println();
        viata(index);
    }
}
