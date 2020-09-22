package com.company;

import java.util.Scanner;

public class Main {

    static String conditions() {

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

        return "La réponse est " + resultat + ", Merci d'avoir participer, Aurevoir";

    }

    static float boucle() {

        System.out.println("Donnez moi un chiffre");

        Scanner nombre_Uti = new Scanner(System.in);

        int number_Uti = nombre_Uti.nextInt();

        float sommepair = 0;

        float sommeimpair = 0;

        float sommetotal;

        for (int I = 1; I < number_Uti; I++) {

            if (I % 2 == 0) {

                sommepair = sommepair + I;

            } else {

                sommeimpair = sommeimpair + I;

            }

        }

        sommetotal = sommeimpair + sommepair;

        System.out.println(sommepair);
        System.out.println(sommeimpair);
        System.out.println(sommetotal);

        return sommetotal;
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println("Quelle exercice veux-tu faire? 'condition' ou 'boucle' ?");

        Scanner exo = new Scanner(System.in);

        String choix = exo.nextLine();

        if (choix.equals("condition")) {

            conditions();

        } else if (choix.equals("boucle")) {

            boucle();

        } else {

            System.out.println("Cette exo n'existe pas");

        }

    }
}
