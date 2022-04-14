import java.util.Scanner;

public class Programme2 {

    public static void main(String[] args){

        int x, y, z;

        Scanner  a = new Scanner(System.in);

        System.out.println("Entrer deux nombres entiers");

        x = a.nextInt();
        y = a.nextInt();

        z = x * y;

        System.out.println("Le produit des deux nombre est:" + " " + x + " "  + "*" + " " + y + " " + "=" + " "  + z);
    }
}