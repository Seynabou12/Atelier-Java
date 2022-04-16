import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args){

        int v, w , t ;

        Scanner b = new Scanner (System.in);

        System.out.println("Entrer un entier v");
        v = b.nextInt();

        System.out.println("Entrer un entier w");
        w = b.nextInt();

        t = v - w;
        System.out.println("La différence de: " + v + " - " + w + " = " + t);

    }
    
}
