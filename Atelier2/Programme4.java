import java.util.Scanner;

public class Programme4 {

    public static void main(String[] args){

        int a, b, c, d;

        Scanner x = new Scanner(System.in);

        System.out.println("Entrer deux nombres entiers");

        a = x.nextInt();
        b = x.nextInt();

        c = a / b;
        d = a % b;

        System.out.println("Le quotient de: " + a + " / " + b + " = " + c + " et il reste : " + d);
    }
}
