package bitaybata;

import java.util.Scanner;

public class BitayBata {

    public static void main(String[] args) {
        char temp;
        String[] bata = {"(_)", "_|_", " |", "/ \\"};

        test a = new test();
        int guess = a.generateRandom();
        String name = a.names[guess];
        int len = bata.length;
        Scanner in = new Scanner(System.in);
        String hide = "";
        for (int i = 0; i < name.length(); i++) {
            hide += " - ";
        }

        /* for (int i = 0; i < name.length(); i++) {
            System.out.print(" _ ");
        }*/
        System.out.println("\n" + a.names[guess]);
        System.out.println("Hint: " + a.hint[guess]);

        do {
            System.out.print("\nEnter Letter: ");
            temp = in.next().charAt(0);;
            if (temp == a.names[guess].charAt(0)) {
                System.out.println(hide);
                System.out.println("correct");
                len = len;
            } else {
                System.out.println(hide);
                System.out.println("Wrong");
                len--;
            }

        } while (len > 0);

    }

}
