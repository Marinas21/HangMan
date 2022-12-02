package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Word: ");
        String litera=scanner.nextLine();
        System.out.println();
        Teren teren=new Teren(litera);
        System.out.print("Letter: ");
        teren.verificare(scanner.nextLine().charAt(0));
    }
}
