package itlognidexter;

import java.util.Scanner;

public class ItlogNiDexter {

    public static void main(String[] args) {
        String name = " ";
        int egg = 0, egg1 = 0, egg2 = 0, egg3 = 0;
        String[] balut = {"Penoy", "Balut#16", "Balut18"};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = in.next();
        Scanner input = new Scanner(System.in);
        for (String balut1 : balut) {
            System.out.print("How many " + balut1 + ": ");
            egg1 = egg =input.nextInt();
        }
    }
}
