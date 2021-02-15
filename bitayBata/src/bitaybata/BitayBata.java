package bitaybata;

import java.util.Scanner;

public class BitayBata {

    public static void main(String[] args) {
        char temp;
        /*String[] bata = {"(_)","_|_"," |","/ \\"};

        String bata1 = "(_)";
        String bata2 ="_|_";
        String bata3 =" |";
        String bata4 ="/ \\";
        System.out.println(bata1);
        System.out.println(bata2);
        System.out.println(bata3);
        System.out.println(bata4);*/

        test a = new test();
        int guess = a.generateRandom();
        String name = a.names[guess];
        int len = a.names[guess].length();

        for (int i = 0; i < name.length(); i++) {
            System.out.print(" _ ");
            System.out.print(" ");
        }
        System.out.println("\n" + a.names[guess]);
        System.out.println("Hint: " + a.hint[guess]);

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter Letter: ");
            temp = in.next().charAt(0);;
            if (temp == a.names[guess].charAt(0)) {
                System.out.println("correct");
                len = len;
            } else {
                System.out.println("Wrong");
                len--;
            }

        } while (len > 0);

    }

}
