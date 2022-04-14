
import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args){

        // Déclaration des attributs

        int nb1, nb2, nb3, nb4, nb5, total, moyenne, reste;

        Scanner x = new Scanner(System.in);

        System.out.println("Entrer le premier nombre");
        nb1 = x.nextInt();

        System.out.println("Entrer le deuxiéme nombre");
        nb2 =  x.nextInt();

        System.out.println("Entrer le troisiéme nombre");
        nb3 = x.nextInt();

        System.out.println("Entrer le quatriéme nombre");
        nb4 = x.nextInt();

        System.out.println("Entrer le cinquiéme nombre");
        nb5 = x.nextInt();

        total = nb1 + nb2 + nb3 + nb4 + nb5;
        System.out.println("La somme des cinq nombres entiers est de: " + nb1 + " + " + nb2 + " + " + nb3 + " + " + nb4 + " + " + nb5 + " = " + total );

        moyenne = total / 5;
        System.out.println("La moyenne est de:" + total + " / " + 5 + " = " + moyenne);

        reste = total % 5;
        System.out.println("Le reste est de : " + total + " % " + 5 + " = " + reste);

    }
}