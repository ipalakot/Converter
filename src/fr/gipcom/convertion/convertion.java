package fr.gipcom.convertion;

//import com.sun.xml.internal.bind.v2.runtime.property.StructureLoaderBuilder;
import java.util.Scanner;
import java.util.InputMismatchException;


public class convertion {
    //fonction de depart
    public static void main(String[] args) {
        Scanner affiche = new Scanner(System.in);
        int choix = 0;
        double valeur;
        boolean rep = true, repChoix = true;
        String reponse;

        do {
            do{
                try {
                    System.out.println("Veuillez choisir la convertion");
                    System.out.println("1- eur -> btc");
                    System.out.println("2- btc -> eur");
                    System.out.println("3- eur -> litecoin");
                    System.out.println("4- litecoin - eur");
                    System.out.println("5- eur - ether");
                    System.out.println("6- ether - eur");
                    System.out.println("0- fermer le programme");
                    choix = affiche.nextInt();
                    if (choix == 0)
                        System.exit(1);
                    repChoix = false;
                }catch (InputMismatchException e)
                {
                    repChoix = true;

                }
            }while (repChoix);




            switch (choix)
            {
                case 1:
                    System.out.println("Vous avez choisi la convertion eur -> btc");
                    System.out.println("Entez votre valeur en eur");
                    valeur = affiche.nextDouble();
                    System.out.println("votre montant vaux: " + valeur * 0.00032);
                    break;
                case 2:
                    System.out.println("Vous avez choisi la convertion btc -> eur");
                    System.out.println("Entez votre valeur en btc");
                    valeur = affiche.nextDouble();
                    System.out.println("votre montant vaux: " + valeur * 3155.46);
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