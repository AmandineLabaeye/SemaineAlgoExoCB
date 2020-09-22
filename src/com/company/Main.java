package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        float resultat = 0;

        System.out.println("Donne moi un chiffre postiifs, négatifs ou nul peut importe");

        Scanner Number = new Scanner(System.in);

        float chiffre = Number.nextInt();

        System.out.println("Ton chiffre est le " + chiffre);

        if (chiffre > 0) {

            System.out.println("Ton chiffre est positif donc ton chiffre va être multiplier par 2");

            resultat = chiffre * 2;

            System.out.println("La réponse est " + resultat + ", Merci d'avoir participer, Aurevoir");

        } else if (chiffre < 0) {

            System.out.println("Ton chiffre est négatif donc ton chiffre va être diviser par 2");

            resultat = chiffre / 2;

            System.out.println("La réponse est " + resultat + ", Merci d'avoir participer, Aurevoir");

        } else if (chiffre == 0) {

            System.out.println("Ton chiffre est nul peux-tu me donner ton nom s'il te plaît ? ");

            Scanner Nom_Uti = new Scanner(System.in);

            String Nom_Users = Nom_Uti.nextLine();

            if (Nom_Users.length() > 7) {
                System.out.println("Ton nom est long, Merci d'avoir participer, Aurevoir");
            } else {
                System.out.println("Ton nom est court, Merci d'avoir participer, Aurevoir");
            }

        } else {

            System.out.println("Les valeurs entrée sont incorrectes, veuillez retenter votre chance");

        }


    }
}
