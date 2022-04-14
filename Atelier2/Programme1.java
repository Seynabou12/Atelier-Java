import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {

        int a, b, c;

        Scanner s = new Scanner(System.in);

        System.out.println("Entrer un nombre a");
        a = s.nextInt();

        System.out.println("Entrer un nombre b");
        b = s.nextInt();

        c = a + b;
        System.out.println("La somme des deux nombres est: "  + a + " + " + b + " = " + c);

    }
}
