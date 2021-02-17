package bitaybata;

import java.util.Random;
import java.util.Scanner;

public class BitayBata {

    String[] hide;

    public static void main(String[] args) {
        char temp;
        String[] bata = {"|        (_)", "|        _|_", "|         | ", "|        / \\"};
        int len = bata.length;
        Scanner in = new Scanner(System.in);
        test a = new test();

        Random r = new Random();
        int ran = r.nextInt(a.names.length);
        System.out.println("random: " + ran);

        String name = a.names[ran];
        System.out.println("name: " + name.length());
        char[] newName = name.toCharArray();
        char[] hide = name.toCharArray();
        System.out.println("name: " + name);

        for (int i = 0; i < name.length(); i++) {
            hide[i] = '-';
            System.out.print(hide[i]);
        }
        System.out.println("\nHint: " + a.hint[ran]);

        for (int i = 1; i <= len; i++) {
            System.out.print("\nEnter Letter: ");
            temp = in.nextLine().charAt(0);

            for (int cnt = 0; cnt < newName.length; cnt++) {
                if (temp == hide[cnt]) {
                    System.out.println("Already taken");
                } else {
                    if (temp == newName[cnt]) {
                        hide[cnt] = temp;
                        i--;
                    }
                }
            }
            System.out.println(hide);
            switch (i) {
                case 1:
                    System.out.println("=============");
                    System.out.println(bata[0]);
                    break;
                case 2:
                    System.out.println("=============");
                    System.out.println(bata[0]);
                    System.out.println(bata[1]);
                    break;
                case 3:
                    System.out.println("=============");
                    System.out.println(bata[0]);
                    System.out.println(bata[1]);
                    System.out.println(bata[2]);
                    break;
                case 4:
                    System.out.println("=============");
                    System.out.println(bata[0]);
                    System.out.println(bata[1]);
                    System.out.println(bata[2]);
                    System.out.println(bata[3]);
                    System.out.println("gameover");
                    break;
            }

            System.out.printf("\n");
            if ((new String(name)).equals(new String(hide))) {
                System.out.println("You Got It!!");
                continue;
            }
        }
    }

}
