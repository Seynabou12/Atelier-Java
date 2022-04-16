
import java.util.Scanner;

public class Calcul{

    public static  int Somme(int a, int b){

        return a + b;
    }

    public static int Difference(int a, int b){

        return a - b;
    }

    public static int Produit(int a, int b){

        return a * b;
    }

    public static int Quotient(int a, int b){

        return a / b;
    }

    public static void main(String[] args)
    {

        int choix ;

        do {

            int nb1, nb2;

            Scanner s = new Scanner(System.in);

            System.out.println("Entrer le premier nombre");
            nb1 = s.nextInt();

            System.out.println("Entrer le deusiéme nombre");
            nb2 =  s.nextInt();

            System.out.println("Quelle operation voulez-vous effectué ????");
            System.out.println("Taper 1 pour l'addition");
            System.out.println("Taper 2 pour la Soustraction");
            System.out.println("Taper 3 pour le produit");
            System.out.println("Taper 4 pour le quotient");

            int operation = s.nextInt();

            switch (operation){

                case 1:

                    System.out.println("La somme est de:" + Somme(nb1, nb2));
                break;

                case 2:
                    System.out.println("La différence  est:" + Difference(nb1, nb2));
                break;

                case 3:
                    System.out.println("Le produit est:" + Produit(nb1, nb2));
                break;

               default:
                    System.out.println("Le quotient est:" + Quotient(nb1, nb2) );
                    break;
            }

            System.out.println("voulez-vous continuer ???");
            System.out.println("Entrer 0 pour arreter et 1 pour continuer");

            choix = s.nextInt();

        }while(choix == 1);

    }
}
