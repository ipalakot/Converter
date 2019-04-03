package fr.gipcom.convertion;

import com.sun.xml.internal.bind.v2.runtime.property.StructureLoaderBuilder;
        import com.sun.xml.internal.ws.api.ha.StickyFeature;
        import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

        import java.util.*;
        import java.io.*;

public class Convertion2 {

    public static Double recuperationValeur(String convertion, String convert)
    {
        Scanner affiche = new Scanner(System.in);
        System.out.println("Vous avez choisi la convertion " + convertion);
        System.out.println("Entez votre valeur en " + convert);
        return affiche.nextDouble();
    }
    public static void affichage(double valeur)
    {
        System.out.println("votre montant vaux: " + valeur);
    }

    public static void main(String[] args) {

        Scanner affiche = new Scanner(System.in);
        int choix = 0;
        double valeur;
        boolean rep = true, repChoix = true;
        String reponse;

        do {

            System.out.println("Veuillez choisir la convertion");
            System.out.println("1- eur -> btc");
            System.out.println("2- btc -> eur");
            System.out.println("3- eur -> litecoin");
            System.out.println("4- litecoin - eur");
            System.out.println("5- eur - ether");
            System.out.println("6- ether - eur");
            System.out.println("0- fermer le programme");
            choix = affiche.nextInt();

            switch (choix)
            {
                case 1:
                    affichage(0.0032 * recuperationValeur("eur-> btc", "eur"));
                    break;
                case 2:
                    affichage(3155.46 * recuperationValeur("eur-> btc", "eur"));

                    break;
                case 3:
                    affichage(0.46 * recuperationValeur("eur-> btc", "eur"));

                    break;
                case 4:
                    affichage(55.46 * recuperationValeur("eur-> btc", "eur"));

                    break;
                case 5:
                    affichage(0.046 * recuperationValeur("eur-> btc", "eur"));

                    break;
                case 6:
                    affichage(155.46 * recuperationValeur("eur-> btc", "eur"));

                    break;

            }
            System.out.println("Voulez-vous recommencez: oui / non ");
            affiche.nextLine();
            reponse = affiche.nextLine();

            if (reponse.equals("oui"))
            {
                rep = true;
            }
            else if(reponse.equals("non"))
            {
                rep = false;
            }
            else{
                rep= true;
                System.out.println("Nous n'avon pas compris votre choix le programme va recommencer");
            }

        }while (rep);




    }
}

